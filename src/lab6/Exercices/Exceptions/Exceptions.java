package lab6.Exercices.Exceptions;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        testWrongInputValue();
    }

    static void testWrongInputValue() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = sc.nextInt();

        try {
            System.out.println("Result: " + (number1 / number2));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception found!");
        }
    }

}
