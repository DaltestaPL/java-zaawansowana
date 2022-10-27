package zadania;

import java.util.TreeMap;

/**
 * Stwórz metodę, która przyjmuje TreeMap i wypisuje w konsoli pierwszy i ostatni EntrySet.
 */
public class Zadanie6 {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Java");
        map.put(10, "C#");
        map.put(5, "Python");

        new Zadanie6().handleTreeMap(map);
    }

    public void handleTreeMap(TreeMap<Integer, String> map) {
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }
}
