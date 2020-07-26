package Ex09_TreeMapExcercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.TreeMap;

public class PersonalJournal {

    private TreeMap<LocalDate, String> entries = new TreeMap<>();

    public void addRecord(LocalDate recordDate, String message) {
        String existingMessage = entries.getOrDefault(recordDate, "");
        entries.put(recordDate, existingMessage + " " + message);
    }

    public void printFromNewestRecord() {
        System.out.println(entries.descendingMap());
    }

    public void printClosestRecord(LocalDate searchedDate) {
        LocalDate ceilingKey = entries.ceilingKey(searchedDate);
        long ceilingDifference = ChronoUnit.DAYS.between(searchedDate, ceilingKey);

        LocalDate floorKey = entries.floorKey(searchedDate);
        long floorDifference = Math.abs(ChronoUnit.DAYS.between(searchedDate, floorKey));

        if (ceilingDifference > floorDifference) {
            System.out.println(entries.get(floorKey));
        } else {
            System.out.println(entries.get(ceilingKey));
        }

    }


}
