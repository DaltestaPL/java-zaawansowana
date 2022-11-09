package zadania.zadanie26;

import java.util.Arrays;
import java.util.List;

/**
 * listę wszystkich Modelów,
 * listę wszystkich aut,
 * listę wszystkich nazw producentów,
 * listę wszystkich lat założenia producentów,
 * listę wszystkich nazw modeli,
 * listę wszystkich lat startu produkcji modeli,
 * listę wszystkich nazw aut,
 * listę wszystkich opisów aut,
 * tylko modele z parzystym rokiem startu produkcji,
 *
 *
 *
 * tylko auta producentów z parzystym rokiem założenia,
 * tylko auta z parzystym rokiem startu produkcji modelu oraz nieparzystym rokiem założenia producenta,
 * tylko auta typu CABRIO z nieparzystym rokiem startu produkcji modelu i parzystym rokiem założenia producenta,
 * tylko auta typu SEDAN z modelu nowszego niż 2019 oraz rokiem założenia producenta mniejszym niż 1919.
 */
public class Zadanie26 {

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "auto rodzinne", CarType.SEDAN);
        Car car2 = new Car("BMW", "auto sportowe", CarType.CABRIO);
        Car car3 = new Car("Audi", "auto rodzinne", CarType.HATCHBACK);
        Car car4 = new Car("Audi", "auto rodzinne", CarType.COUPE);
        Car car5 = new Car("BMW", "auto rodzinne", CarType.SEDAN);

        Model model1 = new Model("A6", 2022, Arrays.asList(car1, car4, car3));
        Model model2 = new Model("X3", 2020, Arrays.asList(car2, car5));

        Manufacturer manufacturer = new Manufacturer("Super fabryka", 1995, Arrays.asList(model1, model2));
        Manufacturer manufacturer2 = new Manufacturer("Jeszcze lepsza fabryka", 2000, Arrays.asList(model1, model2));

        List<Manufacturer> list = Arrays.asList(manufacturer, manufacturer2);

//        listę wszystkich Modelów
//        List<Model> models = list.stream();
    }
}
