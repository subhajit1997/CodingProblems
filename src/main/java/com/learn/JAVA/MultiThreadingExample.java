package com.learn.JAVA;

public class MultiThreadingExample {
    public static void main(String[] args) {
        //Thread Life cycle

        // creating threads in Java
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        ThreadDemo t3 = new ThreadDemo();

        // thread t1 starts
        t1.start();

        // setting priority of t2 to max (10)
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        // checking if t1 is alive
        System.out.println("Is thread t1 alive? " + t1.isAlive());

        // waiting for t1 to die
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // thread t3 starts
        t3.start();

        // setting priority of t3 to min (1)
        t3.setPriority(Thread.MIN_PRIORITY);

        // checking if t1 is alive (should be false now since we joined it)
        System.out.println("Is thread t1 alive? " + t1.isAlive());
        System.out.println("Is thread t2 alive? " + t2.isAlive());
        System.out.println("Is thread t3 alive? " + t3.isAlive());


        final Object lock = new Object(); // Shared lock object

        // Thread 1 - Waits for a signal to proceed
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1 is waiting...");
                try {
                    lock.wait(); // Thread 1 waits until notified
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 has been notified and resumed.");
            }
        });

        // Thread 2 - Notifies Thread 1 to proceed
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000); // Wait for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {
                System.out.println("Thread 2 is notifying Thread 1.");
                lock.notify(); // Notifying Thread 1 to continue
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}

class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getId()+ " value:"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ExampleExtendsThread extends Thread{
    public void run(){
        System.out.print("Welcome");
    }

    public static void main(String[] args) {
        ExampleExtendsThread exampleExtendsThread = new ExampleExtendsThread();
        exampleExtendsThread.start();
    }
}

class ExampleRunnable implements Runnable{
    public static void main(String[] args) {
        ExampleRunnable exampleRunnable = new ExampleRunnable();
        Thread thread = new Thread(exampleRunnable);
        thread.start();
        System.out.println(thread.getName());
    }

    @Override
    public void run() {
        System.out.println("Inside run method");
    }
}
