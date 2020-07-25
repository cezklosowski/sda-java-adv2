package Ex07;

import java.time.LocalDateTime;

public class DecrementingThread extends Thread {
    private Counter counter;

    public DecrementingThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100_0000; i++) {
            counter.decrement();
        }
    }

    @Override
    public synchronized void start() {
        super.start();
        System.out.println(LocalDateTime.now());
        System.out.println("Starting: " + getName());
    }
}
