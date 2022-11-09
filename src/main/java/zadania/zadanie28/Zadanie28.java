package zadania.zadanie28;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Rozszerz klasę ArrayList implementując metodę getEveryNthElement().
 * Metoda ta zwraca listę elementów oraz przyjmuje dwa parametry:
 * indeks elementu od którego zaczyna oraz liczbę określającą co który element ma wybierać.
 * Dla listy: [a, b, c, d, e, f, g] oraz parametrów: startIndex=2 i skip=3 zwróci listę [c, g]
 */
public class Zadanie28 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("s1", "s2", "s3"));
        ExtendedArrayList<String> extendedArrayList = new ExtendedArrayList<>(arrayList);

        extendedArrayList.getEveryNthElement(1, 3);
    }
}
