package Task1;

import Task1.Point2D;
import Task1.Point3D;

public class Main {
    /*public static void main(String[] args) {

        Point2D point2D = new Point2D( 5.25f, 8.40f);
        Point3D point3D = new Point3D(point2D.getX(), point2D.getY(), 3.47f);
         point3D.setXYZ(point2D.getX(), point3D.getY(), point3D.getZ());
        System.out.println(point3D);
    }
}*/
    public static void main(String[] args) {
        Line example = new Line(2.34f, 4.56f, 6.45f, 7.44f);
        example.getLength();
        System.out.println(example.getLength() + "\n" + example);
    }
}