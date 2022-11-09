package zadania.zadanie27;

import java.util.Arrays;

/**
 * Zaprojektuj klasę Joiner, która w konstruktorze będzie przyjmowała separator (string)
 * oraz posiadała metodę join() pozwalającą na podanie dowolnej ilości obiektów typu T.
 * Metoda ta będzie zwracać stringa łącząc wszystkie przekazane elementy wywołując ich metodę toString() i oddzielać je separatorem.
 * np. dla Integerów oraz separatora “-” będzie zwracała: 1-2-3-4…
 */
public class Joiner {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    @SafeVarargs
    public final <F> String join(F... elements) {
        StringBuilder stringBuilder = new StringBuilder();
        for (F element: elements) {
            stringBuilder.append(element);
            stringBuilder.append(separator);
        }
        var length = stringBuilder.toString().length();
        return stringBuilder.substring(0, length - separator.length());
    }

}
