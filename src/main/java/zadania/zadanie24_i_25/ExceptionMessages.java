package zadania.zadanie24_i_25;

public enum ExceptionMessages {

    BASKET_EMPTY_EXCEPTION("Koszyk jest pusty, brak elementów do usunięcia"),
    BASKET_FULL_EXCEPTION("Koszyk jest pełny, nie można dodać więcej elementów");

    private String message;

    ExceptionMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
