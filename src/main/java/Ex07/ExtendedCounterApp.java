package Ex07;

public class ExtendedCounterApp {

    public static void main(String[] args) throws InterruptedException {
        ExtendedCounter extendedCounter = new ExtendedCounter();

        Runnable decrementingOne = () -> {
            for (int i = 0; i < 100000; i++) {
                extendedCounter.decrementCountOne();
            }
        };
        Runnable decrementingTwo = () -> {
            for (int i = 0; i < 100000; i++) {
                extendedCounter.decrementCountTwo();
            }
        };
        Runnable incrementingOne = () -> {
            for (int i = 0; i < 100000; i++) {
                extendedCounter.incrementCountOne();
            }
        };
        Runnable incrementingTwo = () -> {
            for (int i = 0; i < 100000; i++) {
                extendedCounter.incrementCountTwo();
            }
        };

        Thread threadOne = new Thread(decrementingOne);
        Thread threadTwo = new Thread(decrementingTwo);
        Thread threadThree = new Thread(incrementingOne);
        Thread threadFour = new Thread(incrementingTwo);

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();

        threadOne.join();
        threadTwo.join();
        threadThree.join();
        threadFour.join();

        System.out.println(extendedCounter.toString());
    }
}