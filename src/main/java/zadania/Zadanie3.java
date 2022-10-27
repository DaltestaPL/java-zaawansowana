package zadania;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string, a wartością liczba, a następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: "", Wartość: "". Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
 * Przykład:
 * Klucz: Java, Wartość: 18,
 * Klucz: Python, Wartość: 1,
 * …
 * Klucz: PHP, Wartość: 0.
 */
public class Zadanie3 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("Python", 10);
        map.put("PHP", 0);
//        System.out.println(map.containsKey("Python"));
//        map.clear();
//        System.out.println(map.get("Java"));
//        System.out.println(map);
        new Zadanie3().showElements(map);
    }

    private void showElements(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.println("Klucz: " + key + ", " + "Wartosć: " + value));
    }
}
