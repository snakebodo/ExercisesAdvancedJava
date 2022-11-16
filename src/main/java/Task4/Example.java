package Task4;

import org.example.Circle;
import org.example.Rectangle;
import org.example.Shape;
import org.example.Square;

public class Example {
    public static void main(String[] args) {
        Shape circle = new Circle("color", false, 5.15);
        Shape rectangle = new Rectangle("color", false, 1, 1);
        Shape square = new Square("color", false, 2.50);
        System.out.println(circle.toString()+"\n" + rectangle.toString()+ "\n" + square.toString());
    }
}
