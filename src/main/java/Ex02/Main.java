package Ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Na podstawie 100000 elementowej listy z losowo wybranymi wartościami zaimplementuj następujące
funkcjonalności:
1. zwróć listę unikalnych elementów,
2. zwróć listę elementów, które co najmniej raz powtórzyły się w wygenerowanej liście,
         */



        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100_000; i++) {
            randomNumbers.add(random.nextInt(1_000_000 + 1));
        }

        List<Integer> uniqueNumbers = getUnique(randomNumbers);
        System.out.println(uniqueNumbers);

        List<Integer> nonUniqueNumbers = getNonUnique(randomNumbers);
        System.out.println(nonUniqueNumbers);


    }

    public static List<Integer> getUnique(List<Integer> numbers){
        Map<Integer, Long> numbersWithOccurrence = numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        return numbersWithOccurrence.entrySet().stream()
                .filter(element -> element.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static List<Integer> getNonUnique(List<Integer> numbers){
        Map<Integer, Long> numbersWithOccurrence = numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        return numbersWithOccurrence.entrySet().stream()
                .filter(element -> element.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }



}
