package modules;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Alexander Alvarez Marques
 * @version 03-oct-2019
 */
public class Histogram {

    Map<Integer, Integer> counts = new HashMap<>();

    public Histogram(int... values) {

        for (int value : values) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }

    }

    public Set<Integer> getValues() {
        return counts.keySet();
    }

    public int getCount(int key) {
        return counts.get(key);
    }

}
