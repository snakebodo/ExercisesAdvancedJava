package Task6;

public class Example {
    public static void main(String[] args) {


        MovablePoint movablePoint = new MovablePoint(1, 1, 1, 1);
        MovableCircle movableCircle = new MovableCircle(movablePoint, 3.57f);
        movableCircle.moveUp();
        movableCircle.moveDown();
        movableCircle.moveRight();
        movableCircle.moveLeft();
        System.out.println(movablePoint);

    }
}
