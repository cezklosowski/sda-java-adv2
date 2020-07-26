package Ex07_Multithreading;

import java.math.BigDecimal;

public class MultithreadApp {
    public static void main(String[] args) throws InterruptedException {
        /*
        Zrób nową klasę MultithreadApp z metodą main oraz metodą obliczającą silnię z 5000 i drukującą każdy kolejny krok przy mnożeniu. Użyj klasy BigInteger do przechowania danych
         */

        // utworzenie wątków
        Thread threadOne = new Thread(() -> factorialWorker(5000));
        Thread threadTwo = new Thread(() -> factorialWorker(5000));
        Thread threadThree = new Thread(() -> factorialWorker(5000));
        Thread threadFour = new Thread(() -> factorialWorker(5000));

        long start = System.currentTimeMillis();

        // uruchomienie wątków
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();

        // poczekanie aż się wątki wykonają
        threadOne.join();
        threadTwo.join();
        threadThree.join();
        threadFour.join();

        System.out.println("Finished in: " + (System.currentTimeMillis() - start) + " ms");


    }

    public static void factorialWorker(int number){
        BigDecimal result = new BigDecimal(String.valueOf(1));
        for (int i = 1; i < number ; i++) {
            result = result.multiply(new BigDecimal(i));
            System.out.println(result);
        }
    }
}
