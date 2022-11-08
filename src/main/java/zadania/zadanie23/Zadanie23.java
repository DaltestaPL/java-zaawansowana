package zadania.zadanie23;

/**
 * Stwórz klasę Zoo, która będzie posiadała zbiór zwierząt oraz pozwalała na otrzymywanie statystyk
 * na temat posiadanych zwierząt:
 * int getNumberOfAllAnimals() → zwraca liczbę wszystkich zwierząt
 * Map<String, Integer> getAnimalsCount() → zwraca liczbę zwierząt każdego gatunku
 * Map<String, Integer> getAnimalsCountSorted() → zwraca liczbę zwierząt każdego gatunku posortowaną
 * na podstawie ilości zwierząt danego gatunku, gdzie pierwszym elementem zawsze jest gatunek z największą ilością zwierząt
 * void addAnimals(String, int) → dodaje n zwierząt danego gatunku
 */
public class Zadanie23 {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
    }
}
