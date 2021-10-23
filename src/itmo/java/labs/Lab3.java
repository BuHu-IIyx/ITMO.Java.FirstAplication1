package itmo.java.labs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab3 {
    //
    //Exercise 1
    //
    public static void ex1() {
        int[] newArray = {1, 2, 3, 4, 3, 6};
        if (ex1CheckSortArray(newArray)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static boolean ex1CheckSortArray(int[] someArray) {
        boolean control = false;
        for (int i = 1; i < Array.getLength(someArray); i++) {
            if (someArray[i - 1] > someArray[i]) {
                control = false;
                break;
            } else {
                control = true;
            }
        }
        return control;
    }

    //
    //Exercise 2
    //
    //Do this in second lab.
    public static void ex2() {
        int[] newArray = Lab2.ex5GetArray();
        String newArrayString = Lab2.ex5ConvertToString(newArray);
        System.out.println(newArrayString);
    }

    //
    //Exercise 3
    //
    public static void ex3() {
        int[] newArray = {1, 2, 3, 4, 3, 6};
        String newArrayString = Lab2.ex5ConvertToString(newArray);
        System.out.println("Array 1: " + newArrayString);
        int[] swap = swapArray(newArray);
        String newArraySwapString = Lab2.ex5ConvertToString(swap);
        System.out.println("Array 1: " + newArraySwapString);
    }

    public static int[] swapArray(int[] arrayForSwap) {

        int temp = arrayForSwap[0];
        int arrayLength = Array.getLength(arrayForSwap);
        arrayForSwap[0] = arrayForSwap[arrayLength - 1];
        arrayForSwap[arrayLength - 1] = temp;
        return arrayForSwap;
    }

    //
    //Exercise 4
    //
    public static void ex4() {
        int[] newArray = {4, 6, 3, 4, 3, 2, 6};
        int arrayLength = Array.getLength(newArray);
        boolean findFlag = false;

        for (int i = 0; i < arrayLength; i++) {
            int flag = 0;
            for (int j = 0; j < arrayLength; j++) {
                // Убираем одинаковые индексы
                if (i == j) {
                    continue;
                }
                //Находим повторы
                else if (newArray[i] == newArray[j]) {
                    flag += 1;
                    break;
                }
            }
            // Проверяем были ли повторы
            if (flag == 0) {
                findFlag = true;
                System.out.println("Первое уникальное число в массиве: " + newArray[i]);
                break;
            }
        }
        //Проверяем найдено ли хоть одно уникальное значение
        if (!findFlag) {
            System.out.println("Уникальных чисел не найдено");
        }
    }

    //
    //Exercise 5
    //
    public static void ex5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер числа Фибоначчи: ");
        int nNumber = scanner.nextInt();
        int count = 2;
        int i = 0;
        int j = 1;
        while (count < nNumber) {
            count += 1;
            int k = i + j;
            i = j;
            j = k;
        }
        System.out.println(j);
    }

    //
    //Exercise 6
    //
    public static void ex6() {
        int[] array1 = ex6RandomArray(5);
        System.out.println(Arrays.toString(array1));
        mergeSort(array1, 0, array1.length);
        System.out.println(Arrays.toString(array1));
    }

    public static int[] ex6RandomArray(int count) {
        int[] returnArr = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            returnArr[i] = random.nextInt(100) - 50;
        }
        return returnArr;
    }
    //Прошу прощения, скопировал у Вас
    // т.к. сломал себе голову и немогу понять как реализовать эту сортировку самостоятельно..
    public static void mergeSort(int[] array, int leftIncl, int rightExcl) {
        // базовый случай: если подмассив содержит <= 1 элементов, прекратить деление, потому что он отсортирован
        if (rightExcl <= leftIncl + 1) {
            return;
        }

        /* разделить: вычислить индекс среднего элемента  */
        int middle = leftIncl + (rightExcl - leftIncl) / 2;

        mergeSort(array, leftIncl, middle);  // отсортировать левый подмассив
        mergeSort(array, middle, rightExcl); // отсортировать правый подмассив

        /* комбинировать: объединить оба отсортированных подмассива в отсортированный  */
        merge(array, leftIncl, middle, rightExcl);
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int i = left;   // индекс для левого подмассива
        int j = middle; // индекс для правого подмассива
        int k = 0;      // индекс для temp подмассива

        int[] temp = new int[right - left]; // временный массив для слияния

    /* получить следующий меньший элемент из одного из двух подмассивов,
    а затем вставить его в массив, пока один из подмассивов не станет пустым  */
        while (i < middle && j < right) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        /* вставить все оставшиеся элементы левого подмассива в массив */
        for (; i < middle; i++, k++) {
            temp[k] = array[i];
        }

        /* вставить все остальные элементы правого подмассива в массив */
        for (; j < right; j++, k++) {
            temp[k] = array[j];
        }

        /*  эффективное копирование элементов из temp в массив */
        System.arraycopy(temp, 0, array, left, temp.length);

    }

    //
    //Exercise 7
    //
}
