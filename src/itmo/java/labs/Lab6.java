package itmo.java.labs;

public class Lab6 {
    //
    //Exercise 1
    //
    public static void ex1() {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }
    //
    //Exercise 2
    //
    public static void ex2() {
        Home home1 = new Home();
        Home home2 = new Home();
        home1.setHome("Big Ban", 11, 1859);
        home2.setHome("Empire State Building", 102, 1931);
        System.out.println(home1.getHome());
        System.out.println(home2.getHome());
    }
    //
    //Exercise 3
    //
    public static void ex3() {
        //Проверка конструктора, который устанавливает только возраст и название
        Tree tree1 = new Tree(12, "Ольха");
        //Проверка конструктора, который устанавливает все переменные в классе;
        Tree tree2 = new Tree("NOTLIVE", 24, "Дуб");
        System.out.println();
        //Проверка конструктора, который ничего не устанавливает.
        Tree tree3 = new Tree();
        //Вывод на экран результатов работы конструкторов
        System.out.println();
        System.out.println(tree1.getTree());
        System.out.println();
        System.out.println(tree2.getTree());
        System.out.println();
    }
    //
    //Exercise 4
    //
    public static void ex4() {
        Plane plane = new Plane();
        Plane.Wing wing1 = plane.new Wing();
        wing1.weight = 12.55;
        Plane.Wing wing2 = plane.new Wing();
        wing2.weight = 10.12;
        System.out.println("Вес первого крыла: " + wing1.getWeight() +
                "\nВес второго крыла: " + wing2.getWeight());
    }

}
