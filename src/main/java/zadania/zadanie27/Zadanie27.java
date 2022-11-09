package zadania.zadanie27;

import zadania.zadanie26.Manufacturer;
import zadania.zadanie26.Model;

import java.util.Arrays;

/**
 * Zaprojektuj klasę Joiner, która w konstruktorze będzie przyjmowała separator (string)
 * oraz posiadała metodę join() pozwalającą na podanie dowolnej ilości obiektów typu T.
 * Metoda ta będzie zwracać stringa łącząc wszystkie przekazane elementy wywołując ich metodę toString() i oddzielać je separatorem.
 * np. dla Integerów oraz separatora “-” będzie zwracała: 1-2-3-4…
 */
public class Zadanie27 {

    public static void main(String[] args) {
        Joiner joiner = new Joiner("-");
        String s1 = "1";
        String s2 = "2";
        String s3 = "3";
        String s4 = "4";

        Integer i1 = 1;
        Integer i2 = 2;
        Integer i3 = 3;

        Model model2 = new Model("X3", 2020, Arrays.asList(null, null));
        Model model3 = new Model("X3", 2020, Arrays.asList(null, null));


        String join = joiner.join(s1, s2, s3, s4);

        var joinInt = joiner.join(model2, model3);

        System.out.println(joinInt);
        System.out.println(join);
    }
}
