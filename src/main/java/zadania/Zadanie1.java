package zadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą
 * listę posortowaną alfabetycznie od Z do A.
 */
public class Zadanie1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaaabbb");
        list.add("AAAAbbb");

        System.out.println("Bez sortu: " + list);

        Zadanie1.sortList(list);

        System.out.println("Sortowana: " + list);

    }


    public static List<String> sortList(List<String> list){
        Collections.sort(list);
//        list.sort(Comparator.reverseOrder());
        return list;
    }
}
