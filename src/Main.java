import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //printWholeName();
        //printPineTree();
        //printTrianglePerimeter();
        //printTriangleArea();
        convertMinutes();
    }

    public static void printWholeName() {
        String firstName = "Diyana";
        String secondName = "Vasileva";
        String thirdName = "Vasileva";

        System.out.println("My name is " + firstName + " " + secondName + " " + thirdName);
    }

    public static void printTrianglePerimeter() {
        /*float a = 3.5F;
        float b = 4.5F;
        float c = 5.5F;
        float Perimeter = a + b + c;*/

        Scanner number = new Scanner(System.in);
        float a = number.nextFloat();
        float b = number.nextFloat();
        float c = number.nextFloat();
        float Perimeter = a + b + c;


        System.out.println("Triangle Perimeter is: " + Perimeter);
    }

    public static void printTriangleArea() {
        /*float b = 5.1F;
        float h = 2.4F;*/

        Scanner number = new Scanner(System.in);
        float b = number.nextFloat();
        float h = number.nextFloat();
        float Area = b * h / 2;

        System.out.println("The area of the triangle is: " + Area);
    }

    public static void printPineTree() {
        char asterisk = '*';
        System.out.println("     " + asterisk);
        System.out.println("    " + asterisk + " " + asterisk);
        System.out.println("   " + asterisk + " " + asterisk + " " + asterisk);
    }

    public static void convertMinutes(){
        Scanner min = new Scanner(System.in);
        //one year has 525600 minutes

        System.out.println("Enter minutes: ");
        int minutes = min.nextInt();

        int minutesToYears = minutes / 60 / 24 / 365;
        int minutesToDays = minutes / 60 / 24;

        System.out.println(minutes + " minutes converted to years are: " + minutesToYears);
        System.out.println(minutes + " minutes converted to days are: " + minutesToDays);
    }
}