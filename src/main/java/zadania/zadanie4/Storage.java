package zadania.zadanie4;

import java.util.*;

/**
 * Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
 * addToStorage(String key, String value) → dodawanie elementów do przechowywalni
 * printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
 * findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
 *
 * Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
 */
public class Storage {

    private Map<String, List<String>> storage = new HashMap<>();

    public void addToStorage(String key, String value) {
        if (storage.containsKey(key))
            storage.get(key).add(value);
        else
            storage.put(key, new ArrayList<>(Collections.singletonList(value)));
    }

    public void printValues(String key) {
        storage.forEach((k, v) -> {
            if (k.equals(key))
                System.out.println(v);
        });
    }

    public void findKeys(String value) {
        storage.forEach((k, v) -> {
            if (v.contains(value))
                System.out.println(k);
        });
    }

    private void showElements() {
        storage.forEach((key, value) -> System.out.println("Klucz: " + key + ", " + "Wartosć: " + value));
    }

    public static void main(String[] args) {
        var storage = new Storage();

        storage.addToStorage("C#", "9");
        storage.addToStorage("Java", "18");
        storage.addToStorage("Java", "19");
        storage.addToStorage("Python", "10");
        storage.addToStorage("PHP", "0");

        storage.showElements();

        storage.printValues("Java");

        storage.findKeys("0");
    }
}
