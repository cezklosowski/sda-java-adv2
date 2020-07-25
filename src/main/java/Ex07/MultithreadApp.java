package Ex07;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MultithreadApp {
    public static void main(String[] args) {
        /*
        Zrób nową klasę MultithreadApp z metodą main oraz metodą obliczającą silnię z 5000 i drukującą każdy kolejny krok przy mnożeniu. Użyj klasy BigInteger do przechowania danych
         */

        /*        Thread threadOne = new Thread();
        threadOne.start();
        */
        long start = System.currentTimeMillis();
        factorialWorker(5000);
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
