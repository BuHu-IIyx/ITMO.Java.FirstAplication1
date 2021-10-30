package itmo.java.labs.lab8Classes;

public class Director extends Employer {
    //Могут быть дополнительные функции поэтому выведен в отдельный класс
    public Director(String name) {
        this.name = name;
        this.empPosition = position.DIRECTOR;
    }
}
