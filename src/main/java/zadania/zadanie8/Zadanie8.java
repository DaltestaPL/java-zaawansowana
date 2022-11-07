package zadania.zadanie8;

/**
 * Zaimplementuj interfejs Validator, który będzie zawierać w swojej deklaracji metodę boolean validate(Parcel input).
 * Stwórz klasę Parcel z parametrami:
 * • int xLength
 * • int yLength
 * • int zLength
 * • float weight
 * • boolean isExpress
 * Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300, czy każdy z rozmiarów nie jest mniejszy niż 30,
 * czy waga nie przekracza 30.0 dla isExpress=false lub 15.0 dla isExpress=true. W przypadku błędów,
 * powinien o nich poinformować użytkownika.
 */
public class Zadanie8 {

    public static void main(String[] args) {
        Parcel parcel = new Parcel(100,100,100, 50, true);
        Validator validator = new ValidatorImpl();
        validator.validate(parcel); //false
    }
}