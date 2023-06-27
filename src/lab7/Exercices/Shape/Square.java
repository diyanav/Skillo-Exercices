package lab7.Exercices.Shape;

import lab7.Exercices.Shape.Shape;

public class Square extends Shape {
    @Override
    public double getArea(double side) {
        return side*side;
    }

    @Override
    public double getPerimeter(double side) {
        return side*4;
    }
}
