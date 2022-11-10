package zadania.zadanie34;

import java.util.List;

public class ExtendedThreadMain {

    public static void main(String[] args) {
        var strings = List.of("Cześć", "Siema");

        Thread t0 = new ExtendedThread(strings.get(0));
        Thread t1 = new ExtendedThread(strings.get(1));

        t0.start();
        t1.start();
    }
}
