package lab4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercices {
    public static void main(String[] args) {
        //printSumOfArray();
        //printMatrixElements();
        //printDynamicMatrixElements();
        //findBiggestElementOfArray();
        //reverseLinkedList();
        //findSumOfMatrixDiagonal();
        //validatePalindrome();
    }

    public static void printSumOfArray(){
        int[] arr = {2, 23, 5, 19, 4};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Array sum is: " + sum);
    }

    public static void printMatrixElements(){
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                System.out.printf(arr[row][column] + " ");
            }
        }
    }

    public static void printDynamicMatrixElements(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row number: ");
        int rowNumber = sc.nextInt();
        System.out.println("Enter column number: ");
        int columnNumber = sc.nextInt();

        int[][] matrix = new int[rowNumber][columnNumber];

        for(int row = 0; row < rowNumber; row++){
            for(int column = 0; column < columnNumber; column++){
                System.out.printf("number[%d][%d] = ", row, column);
                matrix[row][column] = sc.nextInt();
            }
        }

        System.out.println("The matrix contains " + Arrays.deepToString(matrix));
    }

    public static void findBiggestElementOfArray(){
        int[] arr = {2, 45, 233, 34, 88, 67};
        int biggestElement = 0;

        for(int i = 0; i < arr.length; i++){
            if(biggestElement < arr[i]){
                biggestElement = arr[i];
            }
        }

        System.out.println("The biggest element of the array is: " + biggestElement);
    }

    public static void reverseLinkedList(){
        LinkedList<String> users = new LinkedList<String>();

        users.add("Ani");
        users.add("Bobi");
        users.add("Candis");
        users.add("David");
        users.add("Elena");

        for(int i = 0; i < users.size() / 2; i++){
            String temp = users.get(i);
            users.set(i, users.get(users.size() - i - 1));
            users.set(users.size() - i - 1, temp);
        }

        System.out.println(users);
    }

    public static void findSumOfMatrixDiagonal(){
        int[][] matrix = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };

        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;

        for(int i = 0; i < 4; i++){
            int j = 3;
            sumFirstDiagonal += matrix[i][i];
            sumSecondDiagonal += matrix[i][j--];
        }

        System.out.println("The sum of the first diagonal of the given matrix is: " + sumFirstDiagonal);
        System.out.println("The sum of the second diagonal of the given matrix is: " + sumSecondDiagonal);
    }

    public static void validatePalindrome(){
        String word = "racecar";
        String reversedWord = "";

        for(int i = word.length() -1; i >= 0; i--){
            reversedWord = reversedWord.concat(String.valueOf(word.charAt(i)));
        }

        if(word.equals(reversedWord)) {
            System.out.println("The word" + word + " is palindrome.");
        }
        else{
            System.out.println("The word" + word + " is not palindrome.");
        }
    }
}
