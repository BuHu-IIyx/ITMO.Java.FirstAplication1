package itmo.java.labs;

import itmo.java.labs.Lab12Classes.Counter;

public class Lab12 {
    public static void ex1() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j <= 100; j++) {
                    System.out.println(j);
                }
            }).start();
        }
    }

    public static void ex2() {
        Thread thread = new Thread(() -> {
            System.out.println("In: " + Thread.currentThread().getState());
        });
        System.out.println("Before: " + thread.getState());
        thread.start();
        System.out.println("After: " + thread.getState());
    }

    public static void ex3() {
        Counter counter = new Counter();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
                System.out.println(Thread.currentThread().getName() + "Расчет окончил");
            }
        };
        for (int i = 0; i < 100; i++) {
            new Thread(runnable).start();
        }
        //Не нашел способа как сделать это изящнее
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
    }

    public static void ex4() {
        //ппр
    }
}
