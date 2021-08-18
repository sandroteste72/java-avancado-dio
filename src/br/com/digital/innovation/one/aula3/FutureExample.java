package br.com.digital.innovation.one.aula3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExample {
    private static final ExecutorService peopleToPerformActivity = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Home home = new Home(new Bedroom());
        List<Future<String>> futures =
                new CopyOnWriteArrayList<>(home.getHomework().stream()
                        .map(activity -> peopleToPerformActivity.submit(() -> {
                                    try {
                                        return activity.accomplish();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    return null;
                                })
                        )
                        .collect(Collectors.toList()));

        while (true){
            int numberOfUnfinishedActivities = 0;
            for (Future<?> future : futures) {
                if (future.isDone()){
                    try {
                        System.out.println("Congratulations you finished " + future.get());
                        futures.remove(future);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    numberOfUnfinishedActivities++;
                }
            }
            if (futures.stream().allMatch(Future::isDone)){
                break;
            }
            System.out.println("Number of unfinished activities :: " + numberOfUnfinishedActivities);
            Thread.sleep(500);
        }
        peopleToPerformActivity.shutdown();
    }
}

class Home {
    private List<Room> rooms;

    Home(Room... rooms) {
        this.rooms = Arrays.asList(rooms);
    }

    List<Activity> getHomework() {
        return this.rooms.stream().map(Room::getRoomToDo)
                .reduce(new ArrayList<Activity>(), (pivot, activities) -> {
                    pivot.addAll(activities);
                    return pivot;
                });
    }
}

interface Activity {
    String accomplish() throws InterruptedException;
}

abstract class Room {
    abstract List<Activity> getRoomToDo();
}

class Bedroom extends Room {
    @Override
    List<Activity> getRoomToDo() {

        return Arrays.asList(
                this::tidyUpTheBed,
                this::sweepRoom,
                this::tidyUpWardrobe
        );
    }

    private String tidyUpWardrobe() throws InterruptedException {
        Thread.sleep(5000);
        String tidyUpWardrobe = "tidy up wardrobe";
        System.out.println(tidyUpWardrobe);
        return tidyUpWardrobe;
    }

    private String sweepRoom() throws InterruptedException {
        Thread.sleep(7000);
        String sweepTheRoom = "sweep the room";
        System.out.println(sweepTheRoom);
        return sweepTheRoom;
    }

    private String tidyUpTheBed() throws InterruptedException {
        Thread.sleep(10000);
        String tidyUpTheBed = "tidy up the bed";
        System.out.println(tidyUpTheBed);
        return tidyUpTheBed;
    }
}