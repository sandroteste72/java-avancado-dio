package br.com.digital.innovation.one.aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterations {
    public static void main(String[] args) {
        String[] names = {"Sandro", "Fabiana", "Celia", "Marco", "Emilio", "Socrates"};
        Integer[] numbers = {1, 2, 3, 4, 5};
//        printFilteredNames(names);
//        printAllNames(names);
//        System.out.println();
//        printDoubleEachNumberInTheList(numbers);

        List<String> professions = new ArrayList<>();
        professions.add("Developer");
        professions.add("Tester");
        professions.add("Project Manager");
        professions.add("Quality Manager");

        professions.stream().filter(profession -> profession.endsWith("Manager")).forEach(System.out::println);
    }

    public static void printFilteredNames(String... names) {
        String namesToPrint = "";
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Sandro")) {
                namesToPrint += "" + names[i];
            }
        }
        System.out.println(namesToPrint);

        String namesToPrintFromStream = Stream.of(names)
                .filter(name -> name.equals("Sandro"))
                .collect(Collectors.joining());
        System.out.println(namesToPrintFromStream);
    }

    public static void printAllNames(String... names) {
//        for (String name : names) {
//            System.out.println(name);
//        }

        Stream.of(names).forEach(System.out::println);
    }

    public static void printDoubleEachNumberInTheList (Integer... numbers) {
//        for (Integer number : numbers) {
//            System.out.println(number * 2);
//        }

        Stream.of(numbers).map(number -> number * 2).forEach(System.out::println);
    }
}

