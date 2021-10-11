package itmo.java.labs;

import java.util.Scanner;

public class Lab2 {

    public static void ex1() {
        //Печать нечетных чисел от 1 до 99
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void ex2(){
        enum statusNumber{divThree, divFive, divBoth};
        int countNum = 100;
        ex2DivForNumber(countNum, 3);
        ex2DivForNumber(countNum, 5);
        ex2DivForNumber(countNum, 3, 5);
    }
    public static void ex2DivForNumber(int num, int divNum){
        System.out.print("Делится на " + divNum + ": ");
        for (int i = 0; i <= num; i++){
            if(i%divNum == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void ex2DivForNumber(int num, int divNum1, int divNum2){
        System.out.print("Делится на " + divNum1 + " и на " + divNum2 + ": ");
        for (int i = 0; i <= num; i++){
            if(i%divNum1 == 0 && i%divNum2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void ex3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        System.out.println(ex3CheckNumbers(num1,num2,num3));
    }
    public static boolean ex3CheckNumbers(int num1, int num2, int num3){
        if(num1+num2==num3){
            return true;
        }
        else{
            return false;
        }
    }
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        System.out.println(ex4CheckNumbers(num1, num2, num3));
    }
    public static boolean ex4CheckNumbers(int num1, int num2, int num3){
        if(num1<num2 && num3>num2){
            return true;
        }
        else{
            return false;
        }
    }
}
