package Ex06;

import java.time.LocalDate;

public class AgeValidator {

    public static void checkAge(LocalDate dateOfBirth) throws UnderageException {
        LocalDate latestPossibleDateOfBirth = LocalDate.now().minusYears(18);


        if (dateOfBirth.isAfter(latestPossibleDateOfBirth)) {
            throw new UnderageException();
        } else {
            System.out.println("Mature person. All is ok.");
        }
    }
}
