package zadania.zadanie13;

import zadania.zadanie12.Car;
import zadania.zadanie12.EngineType;
import zadania.zadanie12.Manufacturer;

import java.lang.runtime.SwitchBootstraps;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Stwórz klasę CarService, która będzie zawierać w sobie listę aut, oraz będzie realizować poniższe metody:
 * <p>
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
        List<Car> carsCopy = cars;
        carsCopy.sort(Comparator.comparing(Car::getPrice).reversed());
        return carsCopy.get(0);
    }

    @Override
    public Car getCheapestCar() {
        Double max = Double.MAX_VALUE;
        Car cheapestCar = null;
        for (Car car:cars) {
            if (car.getPrice() < max) {
                max = car.getPrice();
                cheapestCar=car;
            }
        }
        return cheapestCar;
    }

    @Override
    public List<Car> findCarsWithMoreThanThreeManufacturers() {
        return cars.stream().filter(car -> car.getManufacturers().size() > 3).collect(Collectors.toList());
    }

    @Override
    public List<Car> sortBy(String parametr) {
        List<Car> carsCopy = cars;
        switch (parametr) {
            case "rosnaco" -> {
                carsCopy.sort(Comparator.comparing(Car::getPrice));
                return carsCopy;
            }
            case "malejaco" -> {
                carsCopy.sort(Comparator.comparing(Car::getPrice).reversed());
                return carsCopy;
            }
            default -> throw new IllegalStateException("Powinieneś podać rosnaco lub malejaco");
        }
    }

    @Override
    public boolean isOnList(Car car) {
        return cars.contains(car);
    }

    @Override
    public List<Car> findCarsByManufacturer(Manufacturer manufacturer) {
        return cars.stream().filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> findCarsByManufacturerAndByYear(Manufacturer manufacturer, String comparing, Integer year) {
        return cars.stream().filter(car -> car.getManufacturers()
                .contains(manufacturer) && checkManufacturers(car.getManufacturers(), comparing, year)).toList();
    }

    private boolean checkManufacturers(List<Manufacturer> manufacturers, String comparing, Integer year) {
        List<Manufacturer> list = switch (comparing) {
            case "<" -> manufacturers.stream().filter(m -> m.getYear() < year).toList();
            case ">" -> manufacturers.stream().filter(m -> m.getYear() > year).toList();
            case "<=" -> manufacturers.stream().filter(m -> m.getYear() <= year).toList();
            case ">=" -> manufacturers.stream().filter(m -> m.getYear() >= year).toList();
            case "=" -> manufacturers.stream().filter(m -> m.getYear().equals(year)).toList();
            case "!=" -> manufacturers.stream().filter(m -> !m.getYear().equals(year)).toList();
            default -> throw new IllegalStateException("Musisz podać coś z tego jako comparing: <,>,<=,>=,=,!=");
        };
        return !list.isEmpty();
    }

//    private boolean checkManufacturers(List<Manufacturer> manufacturers, String comparing, Integer year) {
//        List<Manufacturer> list;
//        switch (comparing) {
//            case "<":
//                list = manufacturers.stream().filter(m -> m.getYear() < year).toList();
//                break;
//            case ">":
//                list = manufacturers.stream().filter(m -> m.getYear() > year).toList();
//                break;
//            case "<=":
//                list = manufacturers.stream().filter(m -> m.getYear() <= year).toList();
//                break;
//            case ">=":
//                list = manufacturers.stream().filter(m -> m.getYear() >= year).toList();
//                break;
//            case "=":
//                list = manufacturers.stream().filter(m -> m.getYear().equals(year)).toList();
//                break;
//            case "!=":
//                list = manufacturers.stream().filter(m -> !Objects.equals(m.getYear(), year)).toList();
//                break;
//            default:
//                throw new IllegalStateException("Musisz podać coś z tego jako comparing: <,>,<=,>=,=,!=");
//
//        }
}
