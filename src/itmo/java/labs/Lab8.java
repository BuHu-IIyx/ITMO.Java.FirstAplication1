package itmo.java.labs;

import itmo.java.labs.lab8Classes.CallCenter;

public class Lab8 {
    public static void exCallCenter(){
        CallCenter callCenter = new CallCenter();
        callCenter.addEmployer("Василий Васильевич", "Директор");
        callCenter.addEmployer("Александра Александровна", "Менеджер");
        callCenter.addEmployer("Ольга Александровна", "Менеджер");
        callCenter.addEmployer("Екатерина Александровна", "Менеджер");
        callCenter.addEmployer("Катя", "Оператор");
        callCenter.addEmployer("Маша", "Оператор");
        callCenter.addEmployer("Петя", "Оператор");
        callCenter.addEmployer("Вова", "Оператор");
        callCenter.addEmployer("Вася", "Оператор");
        callCenter.newCall();
        System.out.println();
        callCenter.newCall();
        System.out.println();
        callCenter.newCall();
        System.out.println();
        callCenter.newCall();
        System.out.println();
        callCenter.newCall();
        System.out.println();
        callCenter.newCall();
        System.out.println();
        callCenter.newCall();
        System.out.println();
        callCenter.newCall();
        System.out.println();
        callCenter.newCall();
        System.out.println();
        callCenter.newCall();
        System.out.println();

    }
}
