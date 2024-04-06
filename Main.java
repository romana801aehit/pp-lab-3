import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(15.0, 30.0);
        
        ColoredCircle coloredCircle = new ColoredCircle(center, 15.0, "Red");

        System.out.println("Center X: " + coloredCircle.getCenter().getX());
        System.out.println("Center Y: " + coloredCircle.getCenter().getY());
        System.out.println("Radius: " + coloredCircle.getRadius());
        System.out.println("Perimeter: " + coloredCircle.calculatePerimeter());
        System.out.println("Color: " + coloredCircle.getColor());
    }
}
