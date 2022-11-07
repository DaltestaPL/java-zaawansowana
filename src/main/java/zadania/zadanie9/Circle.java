package zadania.zadanie9;

import zadania.zadanie10.Movable;
import zadania.zadanie10.MoveDirection;
import zadania.zadanie11.Resizable;

public class Circle implements Movable, Resizable {
    Point2D center;
    Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;

    }

    @Override
    public void resize(double resizeFactor) {
        var radius = getRadius() * resizeFactor;
        point = new Point2D(center.getX() + radius, center.getY());
    }

    @Override
    public void move(MoveDirection moveDirection) {
        var newCenter = new Point2D(center.getX() + moveDirection.getX(), center.getY() + moveDirection.getY());
        var newPoint = new Point2D(point.getX() + moveDirection.getX(), point.getY() + moveDirection.getY());

        center = newCenter;
        point = newPoint;
    }

    public double getRadius() {
        double radius = 0.0d;
        double part1 = Math.pow((point.getX() - center.getX()),2);
        double part2 = Math.pow((point.getY() - center.getY()),2);
        radius = Math.sqrt(part2+part1);
        return radius;

    }

    public double getPerimeter() {
        double perimeter;
        perimeter = 2*Math.PI*getRadius();
        return perimeter;

    }

    public double getArea() {
        double area;
        area = Math.sqrt(Math.PI*getRadius());
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }
}