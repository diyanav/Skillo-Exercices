package lab7.Examples;

public class Car {
    String brand;
    String model;
    double length;
    double width;
    double weight;
    int horsePower;
    int maxSpeed;

    public Car(String brand, String model, int horsePower, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
}
