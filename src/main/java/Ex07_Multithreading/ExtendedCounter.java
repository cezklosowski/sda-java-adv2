package Ex07_Multithreading;

public class ExtendedCounter {

    private int countOne;
    private int countTwo;

    private final Object flagForCountOne = new Object();
    private final Object flagForCountTwo = new Object();

    public void incrementCountOne() {
        synchronized (flagForCountOne) {
            countOne++;
        }
    }

    public void incrementCountTwo() {
        synchronized (flagForCountTwo) {
            countTwo++;
        }
    }

    public void decrementCountOne() {
        synchronized (flagForCountOne) {
            countOne--;
        }
    }

    public void decrementCountTwo() {
        synchronized (flagForCountTwo) {
            countTwo--;
        }
    }

    @Override
    public String toString() {
        return "ExtendedCounter{" +
                "CountOne=" + countOne +
                ", CountTwo=" + countTwo +
                '}';
    }
}