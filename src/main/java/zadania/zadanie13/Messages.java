package zadania.zadanie13;

public enum Messages {

    WRONG_COMPARING_ARGUMENT("Musisz podać coś z tego jako comparing: <,>,<=,>=,=,!=");

    private String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
