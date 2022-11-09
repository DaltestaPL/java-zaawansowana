package zadania.zadanie28;

import java.util.ArrayList;
import java.util.List;

/**
 * Rozszerz klasę ArrayList implementując metodę getEveryNthElement().
 * Metoda ta zwraca listę elementów oraz przyjmuje dwa parametry:
 * indeks elementu od którego zaczyna oraz liczbę określającą co który element ma wybierać.
 * Dla listy: [a, b, c, d, e, f, g] oraz parametrów: startIndex=2 i skip=3 zwróci listę [c, g]
 */
public class ExtendedArrayList<E> extends ArrayList<E> {

    private ArrayList<E> list;

    public ExtendedArrayList(ArrayList<E> list) {
        this.list = list;
    }

    public List<E> getEveryNthElement(Integer startIndex, Integer skip) {
        var listCopy = list;
        return new ArrayList<>();
    }
}
