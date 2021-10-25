package itmo.java.labs;

public class Tree {
    enum LifeOrNot {LIVE, NOTLIVE}

    ;
    LifeOrNot isLife;
    int age;
    String name;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал.");
    }

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
        this.isLife = LifeOrNot.LIVE;
    }

    public Tree(String isLife, int age, String name) {
        this.age = age;
        this.name = name;
        this.isLife = LifeOrNot.valueOf(isLife);
    }

    public String getTree() {
        return ("Название : " + this.name +
                "\nВозраст: " + this.age +
                "\n" + (isLife == LifeOrNot.LIVE ? "Это дерево живое" : "Это дерево не живое"));
    }
}
