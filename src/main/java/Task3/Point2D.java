package Task3;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point2D() {
        x = 0;
        y = 0;

    }
    public float[] getXY(){
        return new float[]{x, y};
    }
    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}