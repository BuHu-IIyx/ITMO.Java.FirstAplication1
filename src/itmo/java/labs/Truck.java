package itmo.java.labs;

public class Truck extends Car {
    public int numberOfWheels;
    public int maxWeight;

    public Truck(int weight, String model, char color, float speed, int numberOfWheels, int maxWeight) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        System.out.println("Для количества колес установленно значение " + this.numberOfWheels);
    }

    @Override
    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("Для количества колес установленно значение " + this.numberOfWheels);
        System.out.println("Максимальный вес - " + this.maxWeight);
    }
}
