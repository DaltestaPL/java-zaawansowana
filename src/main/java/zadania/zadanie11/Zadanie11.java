package zadania.zadanie11;

import zadania.zadanie9.Circle;
import zadania.zadanie9.Point2D;

/**
 * Stwórz interfejs Resizable posiadający metodę resize(double resizeFactor).
 * Zaimplementuj interfejs w klasie z poprzedniego zadania (Circle).
 * Przy wywołaniu metody resize(doubleresizeFactor),
 * okrąg ma zmienić swoje rozmiary o zadany współczynnik (1.5, 0.5, 10.0, itp).
 * Sprawdź poprawność zmiany rozmiaru wywołując pozostałe metody klasy Circle.
 */
public class Zadanie11 {

    public static void main(String[] args) {
        Point2D center = new Point2D(0,0);
        Point2D point1 = new Point2D(0,10);
        Circle circle = new Circle(center, point1);
        System.out.println("Okrąg przed wykonaniem skalowania: " + circle);
        circle.resize(2);
        System.out.println("Okrąg po wykonaniu skalowania: " + circle);
    }
}
