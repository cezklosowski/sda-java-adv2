package Ex07_Multithreading;

public class CounterApp {
    public static void main(String[] args) throws InterruptedException {

        /*
    Utwórz klasę Counter z polem typu int count. Utwórz dwie metody - increment i decrement zmieniające wartość tego pola o 1. Utwórz dwie klasy rozszerzające klasę Thread, jedna niech się nazywa IncrementingThread, druga DecrementingThread. Niech posiadają pole typu Counter. Przekaż Counter jako parametr konstruktora. Nadpisz metody run - jedna z klas niech w pętli 10000 razy użyje metody increment, druga decrement. Nadpisz metodę start aby drukowała aktualną godzinę i nazwę wątku (getName()) ale nie usuwaj z niej uruchomienia orginalnej implementacji.
Utwórz klasę z metodą main, w niej obiekty: Counter, IncrementingThread, DecrementingThread. Uruchom wątki metodą start. Wydrukuj na koniec wartość pola counter. Sprawdź wykonanie programu, omówmy sekwencję działania.
Stwórz dwa kolejne wątki, jednak użyj konstruktora do którego przekażesz instancję runnable,  wołającej bezpośrednio na instancji counter odpowiednio increment i decrement.
Sprawdź wyniki.
Omówmy jak zabezpieczyć klasę Counter.
     */

        Counter counter = new Counter();
        IncrementingThread incrementingThread = new IncrementingThread(counter);
        IncrementingThread incrementingThread2 = new IncrementingThread(counter);
        DecrementingThread decrementingThread = new DecrementingThread(counter);
        DecrementingThread decrementingThread2 = new DecrementingThread(counter);

        incrementingThread.start();
        incrementingThread2.start();
        decrementingThread.start();
        decrementingThread2.start();

        incrementingThread.join();
        incrementingThread2.join();
        decrementingThread.join();
        decrementingThread2.join();

        System.out.println(counter.getCount());


    }
}
