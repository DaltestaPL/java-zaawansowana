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
public class ValidatorImpl implements Validator {
    @Override
    public boolean validate(Parcel input) {
        return checkSum(input) && checkDimentions(input) && checkWeight(input);
    }

    private boolean checkSum(Parcel input) {
        return  input.getxLength() + input.getyLength() + input.getzLength() <= 300;
    }

    private boolean checkDimentions(Parcel input) {
        return input.getxLength() > 30 && input.getyLength() > 30 && input.getzLength() > 30;
    }

    private boolean checkWeight(Parcel input) {
        if (input.getWeight() < 30 && !input.isExpress()) {
            return true;
        } else return input.getWeight() < 15 && input.isExpress();
    }
}
