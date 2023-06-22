package lab3;
import java.util.Scanner;

public class Exercices {
    public static void main(String[] args) {
        //triangleByAngles();
        //printDayOfWeek();
        //eligibleToWork();
        //revenueCalculator();
        //findBiggestNumber();
        //vacationAdviser();
        //iterateList();
        //reverseList();
    }

    public static void triangleByAngles() {
        Scanner angle = new Scanner(System.in);
        System.out.println("For calculating the triangle possibility, insert the first angle: ");
        int angleA = angle.nextInt();
        System.out.println("Insert the second angle: ");
        int angleB = angle.nextInt();
        System.out.println("Insert the third angle: ");
        int angleC = angle.nextInt();

        int anglesSum = angleA + angleB + angleC;

        if (anglesSum == 180) {
            System.out.println("The triangle can be built based on the angle values.");

            if (angleA == 90 || angleB == 90 || angleC == 90) {
                System.out.println("The triangle is right-angled.");
            } else if (angleA == 60 && angleB == 60 && angleC == 60) {
                System.out.println("The triangle is equilateral.");
            } else if (angleA == angleB || angleA == angleC || angleB == angleC) {
                System.out.println("The triangle is isosceles.");
            } else if (angleA > 90 || angleB > 90 || angleC > 90) {
                System.out.println("The triangle is obtuse.");
            } else if (angleA < 90 && angleB < 90 && angleC < 90) {
                System.out.println("The triangle is acute.");
            } else {
                System.out.println("The triangle is multifaceted.");
            }
        } else {
            System.out.println("The triangle can’t be built based on the angle values.");
        }
    }

    public static void printDayOfWeek() {
        Scanner newDigit = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int digit = newDigit.nextInt();

        switch (digit) {
            case 1:
                System.out.println("The " + digit + "-st day of the week is Monday");
                break;
            case 2:
                System.out.println("The " + digit + "-nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The " + digit + "rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The " + digit + "-th day of the week is Thurstday");
                break;
            case 5:
                System.out.println("The " + digit + "-th day of the week is Friday");
                break;
            case 6:
                System.out.println("The " + digit + "-th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The " + digit + "-th day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid input.");
        }

    }

    public static void eligibleToWork() {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int myAge = age.nextInt();

        if (myAge >= 16) {
            System.out.println("You are eligible to work.");
        } else {
            System.out.println("You are not eligible to work.");
        }
    }

    public static void revenueCalculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter unit price: ");
        int unitPrice = sc.nextInt();

        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();

        int discountPercentage;

        if (quantity >= 100 && quantity <= 120) {
            discountPercentage = 15;
        } else if (quantity > 120) {
            discountPercentage = 20;
        } else {
            discountPercentage = 0;
        }

        double income = unitPrice * quantity;
        double discount = income * discountPercentage / 100;
        double revenue = income - discount;

        System.out.println("The revenue from sale: " + revenue + "$");
        System.out.println("Discount: " + discount + "$(" + discountPercentage + ".0%)");
    }

    public static void findBiggestNumber() {
        int[] numbers = {22, 5, 9, 11, 56, 43};
        int biggestNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (biggestNumber < numbers[i]) {
                biggestNumber = numbers[i];
            }
        }

        System.out.println("The biggest number is: " + biggestNumber);
    }

    public static void vacationAdviser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What type of vacation do you want?");
        String vacationType = sc.nextLine();

        if (!vacationType.equals("Beach") && !vacationType.equals("Mountain")) {
            System.out.println("There is no information about this type of vacation.");
            return;
        }

        System.out.println("What is your budget per day per person?");
        int budget = sc.nextInt();

        switch (vacationType) {
            case "Beach":
                if (budget < 50) {
                    System.out.println("I suggest you to go on a vacation in Bulgaria.");
                } else {
                    System.out.println("I suggest you to go on a vacation outside of Bulgaria.");
                }
                break;
            case "Mountain":
                if (budget < 30) {
                    System.out.println("I suggest you to go on a vacation in Bulgaria.");
                } else {
                    System.out.println("I suggest you to go on a vacation outside of Bulgaria.");
                }
                break;
        }

    }

    public static void iterateList() {
        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] % 5 == 0) {
                System.out.println(list1[i] + " is divisible by 5");
            }
            if (list1[i] > 150) {
                System.out.println(list1[i] + " is greater than 150");
                break;
            }
        }

    }

    public static void reverseList() {
        int[] list1 = {10, 20, 30, 40, 50};

        for (int i = 4; i >= 0; i--) {
            System.out.print(list1[i] + " ");
        }
    }
}
