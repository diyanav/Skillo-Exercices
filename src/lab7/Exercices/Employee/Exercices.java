package lab7.Exercices.Employee;

public class Exercices {
    public static void main(String[] args) {
        Employee employee = new Employee(234, "Diyana", "Vasileva", 2000);
        System.out.println(employee.raiseSalary(10));
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.toString());
    }
}
