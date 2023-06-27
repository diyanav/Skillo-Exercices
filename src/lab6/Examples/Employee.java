package lab6.Examples;

public class Employee {

    public static void main(String[] args) {

    }

    private String firstName;
    private String lastName;
    private int birthYear;

    public Employee() {
        System.out.println("Employee is created");
    }

    public Employee(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public Employee(String firstName, String lastName){
        this(firstName, lastName, -1);
    }

    public void printInfo() {
        System.out.println("First name: " + firstName + ", Last name: " + lastName + ", birth year: " + birthYear);
    }
}

