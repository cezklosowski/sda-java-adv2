package Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      /*
    Utwórz listę 1_000_000 randomowo wygenerowanych intów w zakresie od 0 do 1_000_000 . Następnie przefiltruj ją i metodą findAny() lub findFirst() zwróć wartość która wynosi powyżej 999_995. Jeżeli jest obecna wydrukuj taką informację do konsoli.
     */

        List<Integer> randomIntegers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            randomIntegers.add(random.nextInt(1_000_000 + 1));
        }
        Optional<Integer> potentialNumber = randomIntegers.stream()
                .filter(number -> number > 999_995)
                .findAny();
        // findAny() zwraca optional, bo może nie zwrócić nic

        potentialNumber.ifPresent( number -> {
            System.out.println("There is some number matching criteria. It is: " + number);
        });




    }
}