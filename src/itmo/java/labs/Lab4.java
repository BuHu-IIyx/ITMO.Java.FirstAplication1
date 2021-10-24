package itmo.java.labs;

import java.util.Scanner;

public class Lab4 {
    //
    //Exercise 1
    //
    public static void ex1() {
        String[] stringsArray = {"Hello", "My name Alex", "I'm from Russia", "Home",
                "Coach", "Trust me", "I'm learn Java"};
        System.out.println("Это самая длинная строка: " + ex1LongestString(stringsArray));
    }

    public static String ex1LongestString(String[] stringsArray) {
        String longestString = null;
        int lengthString = 0;
        for (String i :
                stringsArray) {
            if (lengthString < i.length()) {
                longestString = i;
                lengthString = i.length();
            }
        }
        return longestString;
    }

    //
    //Exercise 2
    //
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        if (isStringPalindrome(word)) {
            System.out.println("Это слово: " + word + " - полиндром!");
        } else {
            System.out.println("Это слово: " + word + " - НЕ полиндром!");
        }

    }

    public static boolean isStringPalindrome(String checkString) {
        int stringLength = checkString.length();
        boolean result = false;
        int i = 0;
        int j = stringLength - 1;
        while (i < j) {
            if (checkString.charAt(i) != checkString.charAt(j)) {
                result = false;
                break;

            } else {
                i++;
                j--;
                result = true;
            }
        }
        return result;
    }

    //
    //Exercise 3
    //
    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        String censoredText = text.replace("бяка", "[вырезано цензурой]");
        System.out.print(censoredText);
    }

    //
    //Exercise 4
    //
    public static void ex4() {
        String text = "1.\tНаписать метод для поиска самой длинной строки.\n" +
                "\n" +
                "2.\tНаписать метод, который проверяет является ли слово палиндромом.\n" +
                "\n" +
                "3.\tНапишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».\n" +
                "\n" +
                "4.\tИмеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.\n" +
                "\n" +
                "5.\tНапишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.\n";
        String findText = "1";
        int result = repeatCountFunc(text, findText);
        String answer = "Строка повторяется " + result + (result > 4 || result < 2 ? " раз" : " раза");
        System.out.println(answer);

    }

    public static int repeatCountFunc(String text, String findText) {
        int repeatCount = 0;
        int indexFirst = 0;
        boolean findFlag = true;
        while (findFlag) {
            int temp = text.indexOf(findText, indexFirst);
            if (temp >= 0) {
                indexFirst = temp + 1;
                repeatCount++;
            } else {
                findFlag = false;
            }
        }
        return repeatCount;
    }

    //
    //Exercise 5
    // Мне кажется, я что-то делаю не так.. Но работает))
    //
    public static void ex5() {
        String mainString = new String("This is a test string");
        String[] partsString = mainString.split(" ");
        StringBuilder[] partsSB = new StringBuilder[partsString.length];
        String result = new String();
        for (int i = 0; i < partsString.length; i++) {
            partsSB[i] = new StringBuilder(partsString[i]);
            result += partsSB[i].reverse() + " ";
        }
        System.out.println(result);
    }

}
