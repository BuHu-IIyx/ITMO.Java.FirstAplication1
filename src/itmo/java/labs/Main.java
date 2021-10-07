package itmo.java.labs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ex1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
        //ex2
        System.out.println(( 46 + 10 ) * ( 10 / 3));
        System.out.println(( 29 ) * ( 4 ) * (- 15));
        //ex3
        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println(result);
        //ex4
        double result2 = 3.6 * 4.1 * 5.9;
        System.out.println(result2);
        //ex5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int[] numArray = new int[3];
        for (int i = 0; i < 3; i++) {
            numArray[i] = scanner.nextInt();
        }
        for (int x: numArray) {
            System.out.println(x);
        }
        //ex6
        int b = scanner.nextInt();
        if ((b%2) == 0 & b < 100){
            System.out.println("Выход за пределы диапазона");
        }
        else if ((b%2) == 0){
            System.out.println("Это число четное");
        }
        else {
            System.out.println("Это число нечетное");
        }

    }
}
