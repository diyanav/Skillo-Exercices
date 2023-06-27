package lab7.Exercices.Shape;

public class Circle extends Shape {
    @Override
    public double getArea(double radius) {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter(double radius) {
        return Math.PI*radius*2;
    }
}
