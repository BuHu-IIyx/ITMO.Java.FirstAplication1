package itmo.java.labs.Lab12Classes;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    ReentrantLock lock = new ReentrantLock();
    int count = 0 ;
    public void increment() {
        lock.lock();
        try{
            count = count + 1 ;
        } finally {
            lock.unlock();
        }
    }
    public int getCount() {
        return count ;
    }
}
