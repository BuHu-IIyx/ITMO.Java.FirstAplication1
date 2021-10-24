package itmo.java.labs;

import java.lang.reflect.Array;

public class BubbleSortString {
    public static void main(String[] args) {
        //Отсортировать массив строк через bubble sort
        String[] text = {"I", "still", "learning", "java", "language"};
        int arrLength = Array.getLength(text);
        int numSwitch = 1;
        while (numSwitch != 0) {
            numSwitch = 0;
            for (int i = 0; i < arrLength - 1; i++) {
                int stringCompare = text[i].compareTo(text[i + 1]);
                if (stringCompare > 0) {
                    String temp = text[i];
                    text[i] = text[i + 1];
                    text[i + 1] = temp;
                    numSwitch++;
                }
            }
        }
        for (String i :
                text) {
            System.out.print(i + " ");
        }

    }


}
