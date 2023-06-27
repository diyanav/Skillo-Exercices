package lab7.Examples;

public class Motorcycle extends Vehicle {
    private boolean lightsOn = true;

    public Motorcycle(String brand, String model, double length, double width, double weight, int housePower, int maxSpeed) {
        super(brand, model, length, width, weight, housePower, maxSpeed);
        this.lightsOn = lightsOn;
    }

    public void areLightsOn() {
        if(this.lightsOn == true){
            System.out.println("Lights are on.");
        } else {
            System.out.println("Lights are off.");
        }
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }
}
