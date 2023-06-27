package lab7.Examples;

public class Vehicle {
    String brand;
    String model;
    double length;
    double width;
    double weight;
    int housePower;
    int maxSpeed;

    public Vehicle(String brand, String model, double length, double width, double weight, int housePower, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.housePower = housePower;
        this.maxSpeed = maxSpeed;
    }

    public static void honk() {
        System.out.println("beep beep");
    }
}
