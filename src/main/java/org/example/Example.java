package org.example;

public class Example {
    public static void main(String[] args) {

        Circle circle = new Circle("color", false, 5.15);
        Rectangle rectangle = new Rectangle("color", false, 1, 1);
        Square square = new Square("color", false, 2.50);
        System.out.println(circle.toString()+"\n" + rectangle.toString()+ "\n" + square.toString());
    }
}