package itmo.java.labs;

public class Lab6 {
    public static void ex1(){
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }
    public static void ex2(){
        Home home1 = new Home();
        Home home2 = new Home();
        home1.setHome("Big Ban", 11, 1859);
        home2.setHome("Empire State Building", 102, 1931);
        System.out.println(home1.getHome());
        System.out.println(home2.getHome());
    }

}
