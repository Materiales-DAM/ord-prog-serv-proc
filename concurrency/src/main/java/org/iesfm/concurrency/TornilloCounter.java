package org.iesfm.concurrency;

public class TornilloCounter {
    private int counter;

    public TornilloCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public synchronized void dec() {
        counter--;
    }
}
