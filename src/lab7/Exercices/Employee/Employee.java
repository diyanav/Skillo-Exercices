package lab7.Exercices.Employee;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private double salaryPerMonth;

    public Employee(int id, String firstName, String lastName, double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }

    String getName() {
        return firstName + " " + lastName;
    }

    double getAnnualSalary() {
        return salaryPerMonth*12;
    }

    double raiseSalary(int percentages) {
        salaryPerMonth += salaryPerMonth * percentages / 100;
        System.out.println("New salary is " + salaryPerMonth);
        return salaryPerMonth;
    }

    public String toString() {
        return "ID: " + id + "\nFirst name: " + firstName + "\nLast name: " + lastName + "\nSalary per month: " + salaryPerMonth;
    }
}
