package Ex03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną
alfabetycznie od Z do A.
Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną
alfabetycznie od Z do A nie biorąc pod uwagę wielkości liter.
         */

        List<String> names = Arrays.asList("Jan","Zbigniew","Zahir","Ann","pr0kos","18hot_janice","Kristoff");
        reverseSort(names);
        System.out.println(names);
        reverseSortIgnoreCase(names);
        System.out.println(names);

    }

    public static void reverseSort(List<String> stringsToBeSorted){ // zwraca void, bo podyfikuje oryginalną listę
        Collections.sort(stringsToBeSorted, Collections.reverseOrder());
    }

    public static void reverseSortIgnoreCase(List<String> stringsToBeSorted){
        stringsToBeSorted.sort(String::compareToIgnoreCase);
        Collections.reverse(stringsToBeSorted);
    }


}
