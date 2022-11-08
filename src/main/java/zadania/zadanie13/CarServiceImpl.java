package zadania.zadanie13;

import zadania.zadanie12.Car;
import zadania.zadanie12.EngineType;
import zadania.zadanie12.Manufacturer;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public void removeCar(Car car) {
        cars.remove(car);
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsByEngineType(EngineType engineType) {
        return cars.stream().filter(car -> car.getEngineType().equals(engineType)).collect(Collectors.toList());
    }

    @Override
    public List<Car> getProducedBefore(Integer year) {
        return cars.stream().filter(car -> car.getProdDate() < year).collect(Collectors.toList());
    }

    @Override
    public Car getMostExpensiveCar() {
        return null;
    }

    @Override
    public Car getCheapestCar() {
        return null;
    }

    @Override
    public List<Car> findCarsWithMoreThanThreeManufacturers() {
        return null;
    }

    @Override
    public List<Car> sortBy(Object o) {
        return null;
    }

    @Override
    public Boolean isOnList(Car car) {
        return null;
    }

    @Override
    public List<Car> findCarsByManufacturer(Manufacturer manufacturer) {
        return null;
    }

    @Override
    public List<Car> findCarsByManufacturerAndByYear(Manufacturer manufacturer, String comparing, Integer year) {
        return null;
    }
}
