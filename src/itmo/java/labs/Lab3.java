package itmo.java.labs;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Lab3 {
    //
    //Exercise 1
    //
    public static void ex1(){
        int[] newArray = {1,2,3,4,3,6};
        if(ex1CheckSortArray(newArray)){
            System.out.println("OK");
        }
        else{
            System.out.println("Please, try again");
        }
    }
    public static boolean ex1CheckSortArray(int[] someArray){
        boolean control = false;
        for(int i = 1; i < Array.getLength(someArray); i++){
            if(someArray[i-1] > someArray[i]){
                control  = false;
                break;
            }
            else{
                control = true;
            }
        }
        return control;
    }
    //
    //Exercise 2
    //
    //Do this in second lab.
    public static void ex2(){
        int[] newArray = Lab2.ex5GetArray();
        String newArrayString = Lab2.ex5ConvertToString(newArray);
        System.out.println(newArrayString);
    }
    //
    //Exercise 3
    //
    public static void ex3(){
        int[] newArray = {1,2,3,4,3,6};
        String newArrayString = Lab2.ex5ConvertToString(newArray);
        System.out.println("Array 1: " + newArrayString);
        int[] swap = swapArray(newArray);
        String newArraySwapString = Lab2.ex5ConvertToString(swap);
        System.out.println("Array 1: " + newArraySwapString);
    }
    public static int[] swapArray(int[] arrayForSwap){

        int temp = arrayForSwap[0];
        int arrayLength =Array.getLength(arrayForSwap);
        arrayForSwap[0] = arrayForSwap[arrayLength-1];
        arrayForSwap[arrayLength-1] = temp;
        return arrayForSwap;
    }

    //
    //Exercise 4
    //
    public static void ex4() {
        int[] newArray = {4, 6, 3, 4, 3, 2, 6};
        int arrayLength =Array.getLength(newArray);
        boolean findFlag = false;

        for (int i = 0; i<arrayLength; i++) {
            int flag = 0;
            for (int j = 0; j<arrayLength; j++) {
                // Убираем одинаковые индексы
                if(i == j){
                    continue;
                }
                //Находим повторы
                else if(newArray[i] == newArray[j]){
                    flag += 1;
                    break;
                }
            }
            // Проверяем были ли повторы
            if(flag == 0){
                findFlag = true;
                System.out.println("Первое уникальное число в массиве: " + newArray[i]);
                break;
            }
        }
        //Проверяем найдено ли хоть одно уникальное значение
        if(!findFlag){
            System.out.println("Уникальных чисел не найдено");
        }
    }
    //
    //Exercise 5
    //
    public static void ex5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер числа Фибоначчи: ");
        int nNumber = scanner.nextInt();
        int count = 2;
        int i = 0;
        int j = 1;
        while (count < nNumber){
            count+=1;
            int k = i + j;
            i = j;
            j = k;
        }
        System.out.println(j);
    }
    //
    //Exercise 6
    //
    public static void ex6(){
        System.out.println(Lab2.ex5ConvertToString(ex6RandomArray(5)));

    }
    public static int[] ex6RandomArray(int count){
        int[] returnArr = new int[count];
        Random random = new Random();
        for (int i = 0; i <count; i++){
            returnArr[i] = random.nextInt(100) - 50;
        }
        return returnArr;
    }
    //
    //Exercise 7
    //
}
