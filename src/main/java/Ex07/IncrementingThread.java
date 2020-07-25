package Ex07;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class IncrementingThread extends Thread {
    private Counter counter;

    public IncrementingThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100_0000; i++) {
            counter.increment();
        }
    }

    @Override
    public synchronized void start() {
        super.start();
        System.out.println(LocalDateTime.now());
        System.out.println("Starting: " + getName());
    }
}
