package lab6;

public class Employee {

    public static void main(String[] args) {
        //System.out.println("QA Automation course.");

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
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
