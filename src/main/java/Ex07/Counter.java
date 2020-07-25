package Ex07;

public class Counter {

    private int count;

    public synchronized void increment(){ // kluczowe słowo synchronized - jeżeli odwołuje się jakiś wątek, to na chwilę blokowana jest cała klasa, jak z niego wyjdzie, to inne wątki mogę z niego korzystać
        count++;
    }

    public synchronized void decrement(){
        count--;
    }

    @Override
    public String toString() {
        return "Counter: " + count;
    }

    public int getCount() {
        return count;
    }
}
