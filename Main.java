import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(15.0, 30.0);
        Circle circle = new Circle(center, 15.0);

        System.out.println("Center X: " + circle.getCenter().getX());
        System.out.println("Center Y: " + circle.getCenter().getY());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}