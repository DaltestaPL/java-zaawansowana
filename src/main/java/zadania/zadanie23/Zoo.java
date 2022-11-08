package zadania.zadanie23;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Stwórz klasę Zoo, która będzie posiadała zbiór zwierząt oraz pozwalała na otrzymywanie statystyk
 * na temat posiadanych zwierząt:
 * int getNumberOfAllAnimals() → zwraca liczbę wszystkich zwierząt
 * Map<String, Integer> getAnimalsCount() → zwraca liczbę zwierząt każdego gatunku
 * Map<String, Integer> getAnimalsCountSorted() → zwraca liczbę zwierząt każdego gatunku posortowaną
 * na podstawie ilości zwierząt danego gatunku, gdzie pierwszym elementem zawsze jest gatunek z największą ilością zwierząt
 * void addAnimals(String, int) → dodaje n zwierząt danego gatunku
 */
public class Zoo {

    private Map<String, Integer> animals;

    public Zoo() {
        this.animals = new HashMap<>();
    }

    public int getNumberOfAllAnimals() {
        Integer result = 0;
        for (Integer i : animals.values()) {
            result += i;
        }
        return result;
    }

    Map<String, Integer> getAnimalsCount() {
        return animals;
    }

    Map<String, Integer> getAnimalsCountSorted() {
        return animals.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    void addAnimals(String animal, int numberOfAnimals) {
        animals.put(animal, numberOfAnimals);
    }
}
