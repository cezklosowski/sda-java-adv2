package Ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
        Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest
string, a wartością liczba, a
następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: <k>, Wartość: <v>. Na końcu
każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
         */

        Map<String,Integer> items = new HashMap<>();
        items.put("PEN", 10);
        items.put("PENCIL", 20);
        items.put("PRINTER", 3);
        items.put("PAPER", 2000);
        items.put("PIANO", 0);

        mapPrinter(items);

    }

    private static void mapPrinter(Map<String,Integer> items){
        Set<Map.Entry<String, Integer>> entries = items.entrySet();

        StringBuilder sb = new StringBuilder();
        entries.forEach(entry -> sb.append("Klucz: ")
                .append(entry.getKey())
                .append(" Wartość: ")
                .append(entry.getValue())
                .append(",\n"));
        String result = sb.subSequence(0,sb.length()-2).toString();
        result += ".";
        System.out.println(result);
    }

    /* rozwiązanie z wykorzystaniem iteratora
    private void printMap(Map<String, Integer> map){
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> item = iterator.next();
            stringBuilder.append("Klucz: ")
                    .append(item.getKey())
                    .append(", Wartość: ")
                    .append(item.getValue());
            if(iterator.hasNext()){
                stringBuilder.append(",")
                .append(System.lineSeparator());
            }else{
                stringBuilder.append(".");
            }
        }
        System.out.println(stringBuilder);
    }

     */



}
