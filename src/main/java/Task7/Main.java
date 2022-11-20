package Task7;

public class Main {
    public static void main(String[] args) {
        Circle circleGeometricObject = new Circle(14);
        System.out.println(circleGeometricObject.getArea());
        System.out.println(circleGeometricObject.getPerimeter());
        System.out.println(circleGeometricObject);
        Resizable resizable = new ResizableCircle(40);
        resizable.resize(30);
        System.out.println(resizable);
    }
}
