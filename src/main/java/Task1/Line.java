package Task1;

public class Line {
    private Point2D begin, end;

    public Line(Point2D begin, Point2D end) {
        this.begin = begin;
        this.end = end;
    }
    public Line(float x1, float y1, float x2, float y2){
        this.begin = new Point2D(x1, y1);
        this.end = new Point2D(x2, y2);
    }

    public Point2D getBegin() {
        return begin;
    }

    public void setBegin(Point2D begin) {
        this.begin = begin;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }
    public float getLength (){
        return (float) Math.sqrt(Math.pow(end.getX() - begin.getX(),2)
                + Math.pow(end.getY() - begin.getY(),2));
    }
    public Point2D getMiddlePoint(){
        float xMiddle = (end.getX() + begin.getX()) / 2;
        float yMiddle = (end.getY() + begin.getY()) / 2;
        return new Point2D(xMiddle, yMiddle);
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
