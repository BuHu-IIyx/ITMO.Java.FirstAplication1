package itmo.java.labs;

import java.lang.Integer;

public class countNum implements Comparable<countNum> {
    int num;
    int countI;

    public countNum(int num, int countI) {
        this.countI = countI;
        this.num = num;
    }

    @Override
    public int compareTo(countNum o) {
        int result = Integer.compare(this.countI, o.countI);
        ;
        return result;
    }

    public String toString() {
        return "Число " + this.num + " встречается " + this.countI + " раз";
    }
}

