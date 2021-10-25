package itmo.java.labs;

import java.util.Calendar;

public class Home {
    private String name;
    private int floorCount;
    private int completedYear;
    public void setHome(String name, int floorCount, int completedYear){
        this.name = name;
        this.floorCount = floorCount;
        this.completedYear = completedYear;
    }
    public String getHome(){
        return "Наименование здания: "+ this.name +
                ";\nГод постройки: " + this.completedYear +
                ";\nВозраст: "+ this.howOldIsIt() +
                ";\nКоличество этажей: " + this.floorCount;
    }
    public int howOldIsIt(){
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return (currentYear - this.completedYear);
    }
}
