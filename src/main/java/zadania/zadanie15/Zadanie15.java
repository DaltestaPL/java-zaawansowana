package zadania.zadanie15;

import static zadania.zadanie15.Car.*;

/**
 * Stwórz klasę enum Car ze stałymi FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA, itp.
 * Każdy z pojazdów ma własne parametry np. cena, moc, itp.
 * Enum powinien zawierać metody boolean isPremium() oraz boolean isRegular().
 * Metoda isPremium() powinna zwracać rezultat przeciwny od rezultatu wywołania metody isRegular().
 * Dodatkowo w ramach klasy enum powinna być zadeklarowana i zaimplementowana metoda boolean isFasterThan().
 * Metoda ta powinna przyjmować obiekt typu Car oraz wyświetlać informacje o tym,
 * że wskazany pojazd jest szybszy bądź nie od pojazdu przekazanego w argumencie.
 * W tym celu skorzystaj z metody compareTo().
 */
public class Zadanie15 {
    public static void main(String[] args) {
        var ferrari = FERRARI;
        var opel = OPEL;

        System.out.println(ferrari.isPremium());
        System.out.println(opel.isRegular());

        System.out.println(ferrari.isFasterThan(opel));
        System.out.println(opel.isFasterThan(ferrari));

        System.out.println(FERRARI.getDescription());

    }
}
