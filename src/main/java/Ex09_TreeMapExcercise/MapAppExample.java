package Ex09_TreeMapExcercise;


import java.time.LocalDate;

public class MapAppExample {

    public static void main(String[] args) {
        PersonalJournal journal = new PersonalJournal();
        journal.addRecord(LocalDate.of(2020, 7, 25), "Uczyłem wielowątkowości.");
        journal.addRecord(LocalDate.of(2020, 7, 26), "Robiliśmy fajne zadanie.");
        journal.addRecord(LocalDate.of(2020, 7, 24), "Przygotowywałem zadanie.");
        journal.addRecord(LocalDate.of(2020, 7, 24), "Miałem urodziny.");
        journal.addRecord(LocalDate.of(2020, 7, 20), "Pracowałem.");

        journal.printFromNewestRecord();
        journal.printClosestRecord(LocalDate.of(2020, 7, 21));
        journal.printClosestRecord(LocalDate.of(2020, 7, 23));
    }

}
