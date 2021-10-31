package itmo.java.labs;

import java.util.Arrays;
import java.util.Scanner;

public class Lab9 {
    public static void ex1() {
        int[][] array1 = {{18,-28,18},{28,45,-90},{45,3,14}};
        int arrayMax = findMax(array1);
        System.out.println(arrayMax);
    }
    //Находими максимум
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }
    public static void ex2(){
        int[][] array1 = {{12,4,5},{8,5,0},{4,3,1}};
        int[][] array2 = {{12,4,5},{8,5,0}};
        int[][] array3 = {{12,4,5,6},{8,5,0},{4,3,1}};
        System.out.println("Первый массив" + (isArraySquare(array1) ? " квадратный" : " не квадратный"));
        System.out.println("Второй массив" + (isArraySquare(array2) ? " квадратный" : " не квадратный"));
        System.out.println("Третий массив" + (isArraySquare(array3) ? " квадратный" : " не квадратный"));
    }
    //Проверяем квадратный ли массив
    public static boolean isArraySquare (int[][] array){
        int lengthI = array.length;
        int lengthJ = 0;
        if(isArrayRectangle(array)){
            lengthJ = array[0].length;
        }
        return lengthI == lengthJ;
    }
    //Проверяем прямоугольный ли массив
    public static boolean isArrayRectangle(int[][] array){
        int lengthI = array.length;
        boolean isArrayRectangle = false;
        for (int i = 1; i < lengthI; i++) {
            if(array[i].length != array[i-1].length){
                isArrayRectangle = false;
                break;
            }
            else{
                isArrayRectangle = true;
            }
        }
        return isArrayRectangle;
    }
    public static void ex3(){
        int[][] array1 = {{12,4,5},{28,5,0},{4,3,1}};
        int[][] array2 = {{-32,-41,-53},{-8,-52,-13}};
        int[][] array3 = {{2,4,5,6},{-8,-5,0},{4,3,1}};
        System.out.println("Максимальная строка в первом массиве:\n" + Arrays.toString(array1[findMaxString(array1)]));
        System.out.println("Максимальная строка во втором массиве:\n" + Arrays.toString(array2[findMaxString(array2)]));
        System.out.println("Максимальная строка в третьем массиве:\n" + Arrays.toString(array3[findMaxString(array3)]));
    }
    public static int findMaxString(int[][] array){
        int lengthI = array.length;
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < lengthI; i++) {
            int lengthJ = array[i].length;
            int sumString = 0;
            for (int j = 0; j < lengthJ; j++) {
                sumString+=array[i][j];
            }
            if(i == 0){
                maxSum = sumString;
            }
            else if (maxSum < sumString){
                maxSum = sumString;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int M = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int N = scanner.nextInt();
        char [][] charsArray = new char[M][N];
        fillCharArray(charsArray);
        System.out.println(doubleCharArrayToString(charsArray));
    }
    public static char getRandomChar (){
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int lengthABC = alfabet.length();
        return alfabet.charAt((int)(Math.random()*lengthABC));
    }
    public static void fillCharArray(char[][] charsArray){
        int lengthI = charsArray.length;
        for (int i = 0; i < lengthI; i++) {
            int lengthJ = charsArray[i].length;
            for (int j = 0; j < lengthJ; j++) {
                charsArray[i][j] = getRandomChar();
            }
        }
    }
    public static String doubleCharArrayToString (char [][] charsArray){
        StringBuilder result = new StringBuilder();
        for (char[] chars : charsArray) {
            result.append(Arrays.toString(chars)).append("\n");
        }
        return result.toString();
    }
}
