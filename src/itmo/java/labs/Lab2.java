package itmo.java.labs;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab2 {
    //
    //Exercise 1
    //
    public static void ex1() {
        //Печать нечетных чисел от 1 до 99
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    //
    //Exercise 2
    //
    public static void ex2() {
        int countNum = 100;
        ex2DivForNumber(countNum, 3);
        ex2DivForNumber(countNum, 5);
        ex2DivForNumber(countNum, 3, 5);
    }

    public static void ex2DivForNumber(int num, int divNum) {
        System.out.print("Делится на " + divNum + ": ");
        for (int i = 0; i <= num; i++) {
            if (i % divNum == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void ex2DivForNumber(int num, int divNum1, int divNum2) {
        System.out.print("Делится на " + divNum1 + " и на " + divNum2 + ": ");
        for (int i = 0; i <= num; i++) {
            if (i % divNum1 == 0 && i % divNum2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //
    //Exercise 3
    //
    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        System.out.println(ex3CheckNumbers(num1, num2, num3));
    }

    public static boolean ex3CheckNumbers(int num1, int num2, int num3) {
        if (num1 + num2 == num3) {
            return true;
        } else {
            return false;
        }
    }
    //
    //Exercise 4
    //
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

    public static boolean ex4CheckNumbers(int num1, int num2, int num3) {
        if (num1 < num2 && num3 > num2) {
            return true;
        } else {
            return false;
        }
    }
    //
    //Exercise 5
    //
    public static void ex5(){
        int[] newArray = ex5GetArray();
        System.out.println(ex5ConvertToString(newArray));
        System.out.println(ex5CheckArray(newArray));
    }
    public static int[] ex5GetArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int arrLen = scanner.nextInt();
        int[] newArray = new int[arrLen];
        for (int i = 0; i<arrLen; i++){
            System.out.print("Введите " + (i+1) + "-е число: ");
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }
    public static boolean ex5CheckArray(int[] array){
        int arrayLength = Array.getLength(array);
        if (arrayLength < 3){
            System.out.println("Массив состоит из 2х или менее элементов.");
            return false;
        }
        else if(array[0] == 3 || array[arrayLength-1] == 3){
            return true;
        }
        else {
            return false;
        }
    }
    //It's nice string)
    public static String ex5ConvertToString(int[] array){
        String resultString = "array = [ ";
        for (int i:
             array) {
            resultString+= i + " ";
        }
        resultString+= "]";
        return resultString;
    }
    //
    //Exercise 5
    //
    public static void ex6(){
        int[] newArray = ex5GetArray();
        switch (ex6CheckArray(newArray, 1, 3)){
            case 1:
                System.out.println("Массив содержит число 1.");
                break;
            case 2:
                System.out.println("Массив содержит число 3.");
                break;
            case 3:
                System.out.println("Массив содержит оба числа.");
                break;
            case 0:
                System.out.println("Массив не содержит чисел 1 и 3!");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + ex6CheckArray(newArray, 1,3));
        }
    }
    public static int ex6CheckArray(int[] array, int num1, int num2) {
        int num1Count = 0;
        int num2Count = 0;
        for (int i:
             array) {
            if (i == num1) {
                num1Count+=1;
            }
            if (i == num2) {
                num2Count+=1;
            }
            else {
                continue;
            }
        }
        if(num1Count>0 && num2Count>0){
            return 3;
        }
        else if(num1Count>0){
            return 1;
        }
        else if(num2Count>0){
            return 2;
        }
        else{
            return 0;
        }
    }
}
