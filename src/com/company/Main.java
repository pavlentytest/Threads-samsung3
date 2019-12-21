package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
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
        Thread.sleep(1000);
        t1.flag = false;
        test("1 stopped!");
        t1.join(); // ждет завершение потока - требуется время
        test("Fact 1 stopped!");

        // volatile - переменная доступная для изменения в потоке

   // [-][+][-][+]
    }
    private static Object key = new Object();
    public static void test(String m) {
        try {
            synchronized (key) {
                System.out.print("[");
                Thread.sleep(1000);
                System.out.print(m);
                Thread.sleep(1000);
                System.out.print("]");
             //   key.notify(); // возобновить поток кот. в режиме wait()
             //   key.wait(); // поставить поток в режим wait до вызова notify()
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
