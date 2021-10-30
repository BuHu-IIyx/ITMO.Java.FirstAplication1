package itmo.java.labs.lab8Classes;

public abstract class Employer implements Comparable<Employer> {
    boolean isEmployerFree = true;
    String name;
    position empPosition;

    enum position {
        OPERATOR(1),
        MANAGER (2),
        DIRECTOR (3);
        int i;
        position(int i) {
            this.i = i;
        }
    }

    public void endCall(){
        this.isEmployerFree = true;
    }
    public boolean getCall(){
        if (this.isEmployerFree){
            this.isEmployerFree = false;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int compareTo(Employer o) {
        int result = Integer.compare(this.empPosition.i, o.empPosition.i);
        return result;
    }

}
