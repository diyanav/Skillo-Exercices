package lab6.Examples.testSuperclass;

public class Vehicle {
    private String regNo;

    public Vehicle(String regNo) {
        this.regNo = regNo;
    }

    public Vehicle() {
        System.out.println("Creating vehicle.");
    }
}
