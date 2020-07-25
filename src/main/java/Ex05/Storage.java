package Ex05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>> storageMap = new HashMap<>();

    public Storage() {

    }

    public void addToStorage(String key, String value) {
        storageMap.putIfAbsent(key, new ArrayList<>());
        storageMap.get(key).add(value);
    }

    public void printValues(String key) {
        System.out.println(storageMap.get(key));
    }
}
