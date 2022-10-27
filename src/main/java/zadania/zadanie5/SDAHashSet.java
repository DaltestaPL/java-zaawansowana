package zadania.zadanie5;

import java.util.*;

/**
 * Zaimplementuj klasę SDAHashSet , która będzie implementować logikę HashSet. W tym celu zaimplementuj obsługę metod:
 * • add
 * • remove
 * • size
 * • contains
 * • clear
 */
public class SDAHashSet<T> {

    private Map<Integer, T> map = new HashMap<>();

    public void add(T value) {
        if (!map.containsKey(value.hashCode()))
            map.put(value.hashCode(), value);
    }

    public void remove(T value) {
        map.remove(value.hashCode(), value);
    }

    public int size() {
        return map.size();
    }

    public boolean contains(T value) {
        return map.containsValue(value);
    }

    public void clear() {
        map.clear();
    }
}
