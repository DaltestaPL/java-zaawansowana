package zadania.zadanie13;

import zadania.zadanie12.Car;
import zadania.zadanie12.EngineType;
import zadania.zadanie12.Manufacturer;

import java.util.List;

/**
 * Stwórz klasę CarService, która będzie zawierać w sobie listę aut, oraz będzie realizować poniższe metody:
 *
 * dodawanie aut do listy,
 * usuwanie auta z listy,
 * zwracanie listy wszystkich aut,
 * zwracanie aut z danym silnikiem np: V12,
 * zwracanie aut wyprodukowanych przed podanym rokiem np: 1999,
 * zwracanie najdroższego auta,
 * zwracanie najtańszego auta,
 * zwracanie aut z co najmniej 3 producentami,
 * zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
 * sprawdzanie czy konkretne auto znajduje się na liście,
 * zwracanie listy aut wyprodukowanych przez konkretnego producenta,
 * zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.
 */
public interface CarService {

    void addCar(Car car);
    void removeCar(Car car);
    List<Car> getAllCars();
    List<Car> getCarsByEngineType(EngineType engineType);
    List<Car> getProducedBefore(Integer year);
    Car getMostExpensiveCar();
    Car getCheapestCar();
    List<Car> findCarsWithMoreThanThreeManufacturers();
    List<Car> sortBy(Object o);
    Boolean isOnList(Car car);
    List<Car> findCarsByManufacturer(Manufacturer manufacturer);
    List<Car> findCarsByManufacturerAndByYear(Manufacturer manufacturer, String comparing, Integer year);

}
