package com.company;

// 1 ПРИМЕР  Создание потока путем реализации интерфейса Runnable и путем расширения класса Thread

//class RunnableDemo implements Runnable {
//    private Thread t;
//    private String threadName;
//
//    RunnableDemo(String name) {
//        threadName = name;
//        System.out.println("Создание " +  threadName );
//    }
//
//    public void run() {
//        System.out.println("Выполнение " +  threadName );
//        try {
//            for(int i = 4; i > 0; i--) {
//                System.out.println("Поток: " + threadName + ", " + i);
//                // Пусть поток немного подождет.
//                Thread.sleep(50);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Поток " +  threadName + " прерван.");
//        }
//        System.out.println("Поток " +  threadName + " завершается.");
//
//    }
//
//    public void start () {
//        System.out.println("Запуск " +  threadName );
//        if (t == null) {
//            t = new Thread (this, threadName);
//            t.start ();
//        }
//    }
//}
//
//public class TestThread {
//
//    public static void main(String args[]) {
//        RunnableDemo R1 = new RunnableDemo( "Поток-1");
//        R1.start();
//
//        RunnableDemo R2 = new RunnableDemo( " Поток-2");
//        R2.start();
//
//    }
//}


// 2 ПРИМЕР  Использование булевой изменяемой переменной

//class StopThread extends Thread {
//    /* Setting the volatile variable
//       exit to false */
//    private volatile boolean exit = false;
//
//    /* Call this method to set the
//       exit value to true and stop
//       the thread */
//    public void stopThread() {
//        exit = true;
//    }
//
//    @Override
//    public void run(){
//        // Keep the task in while loop
//        while(!exit) {
//            System.out.println("Thread is running....");
//        }
//        System.out.println("Thread Stopped.... ");
//    }
//}
//public class TestThread {
//    public static void main(String args[]) {
//
//        StopThread thread = new StopThread();
//        // Starting thread
//        thread.start();
//
//        try {
//            Thread.sleep(10);
//        }
//        catch(InterruptedException e) {
//            e.printStackTrace();
//        }
//        /* run below method whenever
//        you want to stop the thread */
//        thread.stopThread();
//    }
//}


// 3 ПРИМЕР  Interrupt()

//class StopThread extends Thread {
//
//    @Override
//    public void run(){
//        // Keep the task in while loop
//        while(!Thread.interrupted()) {
//            System.out.println("Thread is running....");
//        }
//        System.out.println("Thread Stopped.... ");
//    }
//}
//public class TestThread {
//    public static void main(String args[]) {
//
//        StopThread thread = new StopThread();
//        // Starting thread
//        thread.start();
//
//        try {
//            Thread.sleep(10);
//        }
//        catch(InterruptedException e) {
//            e.printStackTrace();
//        }
//        /* run below method whenever
//        you want to stop the thread */
//        thread.interrupt();
//    }
//}


