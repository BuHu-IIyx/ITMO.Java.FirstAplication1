package itmo.java.labs.lab8Classes;

public class Manager extends Employer {
    //Могут быть дополнительные функции поэтому выведен в отдельный класс
    public Manager(String name) {
        this.name = name;
        this.empPosition = position.MANAGER;
    }
}
