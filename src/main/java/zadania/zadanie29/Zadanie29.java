package zadania.zadanie29;

import java.util.function.Function;

/**
 * Zaimplementuj generyczną metodę partOf,
 * która na podstawie tablicy dowolnego typu oraz wskazanej funkcji jako parametrów zwróci % elementów spełniających warunek.
 */
public class Zadanie29 {


    public static <P> double partOf(P[] array, Function<P, Boolean> function) {
        double counter = 0;
        for (P element : array) {
            if (function.apply(element)) {
                counter++;
            }
        }
        return counter / array.length * 100;
    }

    public static void main(String[] args) {
        Integer[] tab = new Integer[]{1,2,3,4,5};
        var result = Zadanie29.partOf(tab, el -> el == 5);
        System.out.println(result + "%");
    }
}
