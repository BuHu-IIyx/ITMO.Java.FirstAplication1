package itmo.java.labs;

import itmo.java.labs.Lab10Classes.User;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Lab10 {
    //
    //Exercise 1
    //
    public static void ex1() {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add((int) (Math.random() * 50));
        }
        for (Object i : arrayList) {
            System.out.print(i + " ");
        }
        deleteRepeat(arrayList);
        System.out.println();
        for (Object i : arrayList) {
            System.out.print(i + " ");
        }
    }

    //Метод удаления дубликатов
    public static void deleteRepeat(ArrayList<Object> arrayList) {
        Set set = new LinkedHashSet();
        for (Object i : arrayList) {
            set.add(i);
        }
        arrayList.clear();
        arrayList.addAll(set);
    }

    //
    //Exercise 2
    //
    public static void ex2() {
        //Создаем экземпляры списков
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        //Добавляем в ArrayList 1 млн. записей
        Instant startArray = Instant.now();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        Instant stopArray = Instant.now();
        System.out.println("Добавление 1 млн. записей в ArrayList заняло: "
                + Duration.between(startArray, stopArray).toMillis() + "мс.");
        //Добавляем в LinkedList 1 млн. записей
        Instant startLinked = Instant.now();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add((int) (Math.random() * 10));
        }
        Instant stopLinked = Instant.now();
        System.out.println("Добавление 1 млн. записей в LinkedList заняло: "
                + Duration.between(startLinked, stopLinked).toMillis() + "мс.");
        //Выбираем из ArrayList 100к записей
        Instant startFindArray = Instant.now();
        for (int i = 0; i < 100000; i++) {
            arrayList.get((int) (Math.random() * 1000000));
        }
        Instant stopFindArray = Instant.now();
        System.out.println("Выбор 100к записей в ArrayList заняло: "
                + Duration.between(startFindArray, stopFindArray).toMillis() + "мс.");
        //Выбираем из LinkedList 100к записей
        Instant startFindLinked = Instant.now();
        for (int i = 0; i < 100000; i++) {
            linkedList.get((int) (Math.random() * 1000000));
        }
        Instant stopFindLinked = Instant.now();
        System.out.println("Выбор 100к записей в LinkedList заняло: "
                + Duration.between(startFindLinked, stopFindLinked).toMillis() + "мс.");

        //ArrayList работает с этими операциями на много быстрее, т.к. доступ к элементу списка осуществляется на прямую,
        //а LinkedList приходится проходить сначала и до нужного элемента каждый раз.
    }

    //
    //Exercise 3
    //
    public static void ex3() {
        HashMap<User, Integer> gameMap = new HashMap<>();
        gameMap.put(new User("Alex"), 10);
        gameMap.put(new User("Sam"), 20);
        gameMap.put(new User("Fedor"), 30);
        gameMap.put(new User("Ivan"), 40);
        gameMap.put(new User("Alik"), 50);
        gameMap.put(new User("Kostik"), 60);
        gameMap.put(new User("Semen"), 70);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println(gameMap.get(new User(name)));
    }

    //Это так, на всякий случай. Для учета баллов.
    public static void addScore(HashMap<User, Integer> gameMap, User gamer, Integer score) {
        if (gameMap.containsKey(gamer)) {
            Integer temp = gameMap.get(gamer) + score;
            gameMap.put(gamer, temp);
        } else {
            gameMap.put(gamer, score);
        }
    }

    //
    //Exercise 4
    //
    public static void ex4() {
        String[] stringsArray = {"Vasya", "Petya", "Petya", "X", "X", "X",
                "BlaBlaBla", "BlaBlaBla", "BlaBlaBla"};
        Map<String, Integer> newMap = convertToMap(stringsArray);
        System.out.println(newMap);
    }

    public static Map<String, Integer> convertToMap(String[] array) {
        Map<String, Integer> newCountList = new HashMap<>();
        for (int i = 0; i < array.length - 1; i++) {
            int countI = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    countI++;
                }
            }
            boolean check = !newCountList.containsKey(array[i]);
            if (check) {
                newCountList.put(array[i], countI);
            }
        }
        return newCountList;
    }
}
