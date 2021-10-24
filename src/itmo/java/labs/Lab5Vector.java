package itmo.java.labs;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Lab5Vector {
    int x;
    int y;
    int z;

    public Lab5Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public int scalarProduct(@NotNull Lab5Vector newVector) {
        return (this.x * newVector.x) + (this.y * newVector.y) + (this.z * newVector.z);
    }

    public Lab5Vector vectorProduct(Lab5Vector newVector) {
        Lab5Vector vectorResult = new Lab5Vector
                ((this.y * newVector.z - this.z * newVector.y),
                        (this.z * newVector.x - this.x * newVector.z),
                        (this.x * newVector.y - this.y * newVector.x));
        return vectorResult;
    }

    public double vectorAngle(Lab5Vector newVector) {
        double result = this.scalarProduct(newVector) / (this.getLength() * newVector.getLength());
        return result;
    }

    public Lab5Vector sumVector(Lab5Vector newVector) {
        Lab5Vector vectorResult = new Lab5Vector
                ((this.x + newVector.x), (this.y + newVector.y), (this.z + newVector.z));
        return vectorResult;
    }

    public Lab5Vector subVector(Lab5Vector newVector) {
        Lab5Vector vectorResult = new Lab5Vector
                ((this.x - newVector.x), (this.y - newVector.y), (this.z - newVector.z));
        return vectorResult;
    }

    public static Lab5Vector[] generateVector(int n) {
        Lab5Vector[] vectorsArray = new Lab5Vector[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            vectorsArray[i] = new Lab5Vector
                    (random.nextInt(50) - (50 / 2),
                            random.nextInt(50) - (50 / 2),
                            random.nextInt(50) - (50 / 2));
        }
        return vectorsArray;
    }

    public void printVector() {
        System.out.println("[x: " + this.x + ", y: " + this.y + ", z: " + this.z + "]");
    }
}
