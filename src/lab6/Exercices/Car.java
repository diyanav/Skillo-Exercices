package lab6.Exercices;

public class Car {
    private String name;
    private String color;
    private int releaseYear;
    private int horsePower;
    private boolean secondHand;

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public Car(String name, String color, boolean secondHand) {
        this(name, color, false);
    }

    public Car(String name, String color, int releaseYear, int horsePower) {
        this(name, "N/A", releaseYear, -1);
    }

    public Car(String name, int releaseYear, int horsePower, boolean secondHand) {
        this(name, -1, horsePower, secondHand);
    }

    public Car() {
        System.out.println("A car was created.");
    }
}
