package org.example;

public class Circle extends Shape {

    private double radiusValue;


    public Circle(String color, boolean isFilled, double radiusValue) {
        super(color, isFilled);
        this.radiusValue = radiusValue;
    }

    public double getRadiusValue() {
        return radiusValue;
    }

    public void setRadiusValue(double radiusValue) {
        this.radiusValue = radiusValue;
    }

    public Circle() {
        super();
        radiusValue = 1;
    }
    public double getArea(){
     return  Math.PI * radiusValue * radiusValue;
    }
    public double gettPerimeter(){
        return 2* Math.PI * radiusValue;
    }

    @Override
    public String toString() {
        return "Circle with radius =" + radiusValue + "which is a subclass off" + super.toString();
    }
}


