package org.example;
 public abstract class Shape {
        private String color;
        private boolean isFilled;

    protected Shape() {
        color = "unknown";
        isFilled = false;

    }

    protected Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "Shape with color of " + color + " and filled/NotFilled" + isFilled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

}