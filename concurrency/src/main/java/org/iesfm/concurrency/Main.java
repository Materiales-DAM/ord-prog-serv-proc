package org.iesfm.concurrency;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce el número de tornillos que se desean fabricar");
            int numTornillos = scanner.nextInt();
            scanner.nextLine();
            TornilloCounter counter = new TornilloCounter(numTornillos);

            Thread worker1 = new Thread(new WorkerTask(counter));
            Thread worker2 = new Thread(new WorkerTask(counter));

            worker1.start();
            worker2.start();


            worker1.join();
            worker2.join();

            System.out.println("Se han fabricado los tornillos");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
