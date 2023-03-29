package org.iesfm.concurrency;

public class WorkerTask implements Runnable {

    private TornilloCounter tornilloCounter;

    public WorkerTask(TornilloCounter tornilloCounter) {
        this.tornilloCounter = tornilloCounter;
    }

    @Override
    public void run() {
        while(tornilloCounter.getCounter() > 0) {
            tornilloCounter.dec();
            System.out.println("Otro tornillo");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
