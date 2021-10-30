package itmo.java.labs.lab7Classes;

public class Box extends Shape {
    double shapeInBoxVolume = 0;
    public Box (double volume){
        this.volume = volume;
    }
    public boolean add (Shape newShape){
        this.shapeInBoxVolume += newShape.getVolume();
        if (this.volume <= this.shapeInBoxVolume){
            this.shapeInBoxVolume -= newShape.getVolume();
            return false;
        }
        else{
            return true;
        }
    }
}
