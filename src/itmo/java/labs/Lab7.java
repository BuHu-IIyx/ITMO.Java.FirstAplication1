package itmo.java.labs;

import itmo.java.labs.lab7Classes.Ball;
import itmo.java.labs.lab7Classes.Box;
import itmo.java.labs.lab7Classes.Cylinder;
import itmo.java.labs.lab7Classes.Pyramid;

public class Lab7 {
    //
    //Exercise 1
    //
    public static void ex1() {
        Truck truck1 = new Truck(3200, "Kamaz", 'g', (float) 120.544, 8, 5000);
        System.out.println();
        truck1.outPut();
        System.out.println();
        truck1.newWheels(12);
    }
    //
    //Exercise 2
    //
    public static void ex2() {
        Box box = new Box(23);
        Ball ball = new Ball();
        ball.setVolume(12);
        Cylinder cylinder = new Cylinder();
        cylinder.setVolume(10);
        Pyramid pyramid = new Pyramid();
        pyramid.setVolume(5);
        System.out.println("Шар "+ (box.add(ball) ? "": "не " ) + "добавлен в коробку.");
        System.out.println("Цилиндр "+ (box.add(cylinder) ? "": "не " ) + "добавлен в коробку.");
        System.out.println("Пирамида "+ (box.add(pyramid) ? "": "не " ) + "добавлен в коробку.");
        System.out.println("Шар "+ (box.add(ball) ? "": "не " ) + "добавлен в коробку.");
        System.out.println("Шар "+ (box.add(ball) ? "": "не " ) + "добавлен в коробку.");
        System.out.println("Шар "+ (box.add(ball) ? "": "не " ) + "добавлен в коробку.");
    }
}
