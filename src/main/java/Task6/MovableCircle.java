package Task6;

public class MovableCircle implements Movable {
    private MovablePoint act1;
    private float radius;

    public MovableCircle(MovablePoint act1, float radius) {
        this.act1 = act1;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        act1.moveUp();
    }

    @Override
    public void moveDown() {
        act1.moveDown();
    }

    @Override
    public void moveLeft() {
        act1.moveLeft();
    }

    @Override
    public void moveRight() {
        act1.moveRight();
    }

    @Override
    public String toString() {
        return "(" + act1 + radius + ")";
    }
}
