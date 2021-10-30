package itmo.java.labs.lab8Classes;

import java.util.ArrayList;
import java.util.Collections;

public class CallCenter {
    ArrayList<Employer> employers = new ArrayList<>();

    public void addEmployer(String name, String position) {
        switch (position) {
            case "Менеджер" -> {
                Manager manager = new Manager(name);
                employers.add(manager);
                Collections.sort(employers);
                System.out.println("Сотрудник успешно добавлен.");
            }
            case "Оператор" -> {
                Operator operator = new Operator(name);
                employers.add(operator);
                Collections.sort(employers);
                System.out.println("Сотрудник успешно добавлен.");
            }
            case "Директор" -> {
                Director director = new Director(name);
                employers.add(director);
                Collections.sort(employers);
                System.out.println("Сотрудник успешно добавлен.");
            }
            default -> System.out.println("Данная должность не предусмотренна штатным расписанием.");
        }
    }

    public void newCall() {
        boolean result = false;
        int i = 0;
        while (!result) {
            i++;
            if (i > 9) {
                System.out.println("Все операторы заняты, перезвоните позже.");
                break;
            }
            result = dispatchCall();
        }
    }

    public boolean dispatchCall() {
        boolean result = false;
        for (Employer i :
                employers) {
            if (i.getCall()) {
                System.out.println("Звонок переведен на " + i.name);
                result = true;
                break;
            }
        }
        return result;
    }
}
