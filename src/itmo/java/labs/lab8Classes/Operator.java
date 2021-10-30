package itmo.java.labs.lab8Classes;

public class Operator extends Employer{
    //Могут быть дополнительные функции поэтому выведен в отдельный класс
    public Operator(String name){
        this.name = name;
        this.empPosition = position.OPERATOR;
    }
}
