package br.com.digital.innovation.one.aula3;

public class ThreadExample {
    public static void main(String[] args) {
        PDFGenerator pdfGenerator = new PDFGenerator();
        LoadingBar loadingBar = new LoadingBar();

        pdfGenerator.start();
        loadingBar.start();

//        System.out.println("Nome da thread " + thread.getName());
//        System.out.println("Nome da thread1 " + thread1.getName());

//        LoadingBar2 loadingBar2 = new LoadingBar2();
//        LoadingBar3 loadingBar3 = new LoadingBar3();
//        loadingBar2.run();
//        loadingBar3.run();
    }
}

class PDFGenerator extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Generate PDF");
    }
}

class LoadingBar extends Thread {

    @Override
    public void run() {
        System.out.println("Loading...");
    }
}

class LoadingBar2 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Run LoadingBar2 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LoadingBar3 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Run LoadingBar3 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}