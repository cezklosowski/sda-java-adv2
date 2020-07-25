package Ex06;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws UnderageException {
        /*
        Utwórz klasę UnderageException dziedziczącą po klasie exception. Stwórz klasę AgeValidator z metodą validate, która po otrzymaniu LocalDate z datą urodzenia sprawdzi czy dana osoba jest pełnoletnia na dzisiejszy dzień. Jeżeli tak to powinna zostać wydrukowana wiadomość o byciu pełnoletnim. Jeżeli nie, to powinien zostać rzucony powyższy wyjątek.
         */

        LocalDate personOne = LocalDate.of(1980,02,03);
        LocalDate personTwo = LocalDate.of(1999,02,03);
        LocalDate personThree = LocalDate.of(2008,02,03);

        AgeValidator.checkAge(personOne);
        AgeValidator.checkAge(personTwo);
        AgeValidator.checkAge(personThree);
    }
}
