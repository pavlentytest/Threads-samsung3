package com.company;

public class Main {

    public static void main(String[] args) {
        // процесс (программа)
        // поток
        // 1. extends Thread => run();
        // 2. implements Runnable => run();

        // анонимный класс

        //new MyThread("+").start();

        MyThread t1 = new MyThread("+");
        t1.start();
        MyThread t2 = new MyThread("-");
        t2.start();

   // [-][+][-][+]
    }

    public synchronized static void test(String m) {
        try {
            System.out.print("[");
            Thread.sleep(1000);
            System.out.print(m);
            Thread.sleep(1000);
            System.out.print("]");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
