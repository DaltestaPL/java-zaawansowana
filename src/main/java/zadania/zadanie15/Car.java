package zadania.zadanie15;

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
public enum Car {

    FERRARI(100, 300, "Super szybki samochód"),
    PORSCHE(95, 250, "Super szybki samochód"),
    MERCEDES(90, 100, "Super szybki samochód"),
    BMW(85, 100, "Super wygodny samochód"),
    OPEL(70, 90, "Super szybki samochód"),
    FIAT(65, 75, "Super szybki samochód"),
    TOYOTA(60, 65, "Super szybki samochód");

    private Integer price;
    private Integer power;
    private String description;

    Car(Integer price, Integer power, String description) {
        this.price = price;
        this.power = power;
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getPower() {
        return power;
    }

    public String getDescription() {
        return description;
    }

    public boolean isPremium() {
        return price > 80;
    }

    public boolean isRegular() {
        return price <= 80;
    }

    public boolean isFasterThan(Car car) {
        return this.power.compareTo(car.power) > 0;
    }

}
