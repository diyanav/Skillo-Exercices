package lab6.Examples.testSuperclass;

public class Car extends Vehicle {

    private String brand;

    public Car(String regNo, String brand) {
        super(regNo);
        this.brand = brand;
    }

    public Car(String brand) {
        super();
        this.brand = brand;
    }
}

