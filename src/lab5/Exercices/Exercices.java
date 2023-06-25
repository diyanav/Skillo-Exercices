package lab5.Exercices;

import java.util.Scanner;

public class Exercices {
    public static void main(String[] args) {
        //int[] numbers = {9, 4, 3};
        //System.out.println(findSmallestNumber(numbers));
        //System.out.println(averageNumber(numbers));
        //displayMiddleCharacter("hello");
        //countWord(" hello word");
        //System.out.println(isEven(5));
        //System.out.println(isPalindrome());
    }

    static int findSmallestNumber(int[] numbers) {
        int smallest = numbers[0];

         for(int i = 0; i < numbers.length; i++) {
             if(numbers[i] < smallest) {
                 smallest = numbers[i];
             }
         }

        return smallest;
    }

    static int averageNumber(int[] numbers) {
        int average = 0;

        for(int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        average /= numbers.length;

        return average;
    }

    static void displayMiddleCharacter(String word) {
        int textLength = word.length();

        if(textLength %2 == 0) {
            char firstChar = word.charAt(textLength / 2 - 1);
            char secondChar = word.charAt(textLength / 2);

            System.out.println("Middle characters are " + firstChar + " and " + secondChar);
        } else {
            System.out.println("Middle character is " + word.charAt(textLength/2));
        }
    }

    static void countWord(String text) {
        text = text.trim();
        int count = 1;

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count + " words in string");
    }

    static boolean isEven(int argument) {
        boolean isEven = false;
        if(argument %2 == 0) {
            isEven = true;
        }
        return isEven;
    }

    static boolean isPalindrome() {
        int remainder;
        int reversedNumber = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = sc.nextInt();

        if (number >= 0) {
            while (number != 0) {
                remainder = number % 10;
                reversedNumber = (reversedNumber * 10) + remainder;
                number = number / 10;
            }

            return (number == reversedNumber);

        } else {
            System.out.println("Invalid number!");
            return false;
        }
    }
}
