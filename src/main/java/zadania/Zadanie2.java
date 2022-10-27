package zadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą
 * listę posortowaną alfabetycznie od Z do A.
 */
public class Zadanie2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaaabbb");
        list.add("AAAAbbb");

        System.out.println("Bez sortu: " + list);

        Zadanie2.sortList(list);

        System.out.println("Sortowana: " + list);

    }


    public static List<String> sortList(List<String> list){
        Comparator<String> listComparator = (o1, o2) -> o2.toLowerCase().compareTo(o1.toLowerCase());
        list.sort(listComparator);
        return list;
    }
}
