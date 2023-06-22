package lab3;
import java.util.Scanner;

public class examples {
    public static void main(String[] args) {
        //testArithmeticOperations();
        //testAutoOperations();
        //testAssignmentOperators();
        //testLogicalOperators();
        //testTernaryOperators();
        //testIfsStatement();
        //testSwitchCaseStatement();
        //testForLoop();
        //testForIterateArray();
        //testWhileLoop();
        //testWhileLoopArray();
        //testDoWhileLoop();
        //testDoWhileLoopArray();
        //testContinueStatement();
        //testContinueStatement();
        //testBreakStatement();
    }

    public static void testArithmeticOperations() {
        int num1 = 100;
        int num2 = 20;

        System.out.println("num1 + num2: " + (num1 + num2));
        System.out.println("num1 - num2: " + (num1 - num2));
        System.out.println("num1 * num2: " + (num1 * num2));
        System.out.println("num1 / num2: " + (num1 / num2));
        System.out.println("num1 % num2: " + (num1 % num2));
    }

    public static void testAutoOperations() {
        int num1 = 100;
        int num2 = 200;

        num1++;
        num2--;

        System.out.println("num1: " + num1++);
        System.out.println("num2: " + num2--);

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public static void testAssignmentOperators() {
        int num1 = 10;
        int num2 = 20;

        num2 = num1;
        System.out.println("num2: " + num2);

        num2 += num1;
        System.out.println("num2: " + num2);

        num2 -= num1;
        System.out.println("num2: " + num2);

        num2 *= num1;
        System.out.println("num2: " + num2);

        num2 /= num1;
        System.out.println("num2: " + num2);

        num2 %= num1;
        System.out.println("num2: " + num2);
    }

    public static void testLogicalOperators() {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("!(b1 && b2): " + (!(b1 && b2)));
    }

    public static void testTernaryOperators() {
        int num1, num2;
        num1 = 25;
        num2 = (num1 == 10) ? 100 : 200;
        System.out.println("num2: " + num2);
    }

    public static void testIfsStatement() {
        int num = 100;

        if (num < 100) {
            System.out.println("number is less than 100");
            if (num < 50) {
                System.out.println("number is less than 50");
            }
        } else if (num == 0) {
            System.out.println("number is 0");
        } else {
            System.out.println("number is more than 100");
        }
    }

    public static void testSwitchCaseStatement() {
        int i = 7;

        switch (i) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 4:
                System.out.println("Case 4");
                break;
            default:
                System.out.println("Default");
        }
    }

    public static void testForLoop() {
        for (int i = 10; i > 1; i--) {
            System.out.println("The value is: " + i);
        }
    }

    public static void testForIterateArray() {
        int[] arr = {2, 11, 45, 9, 35};

        //i start with 0 as array index starts with 0 too
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void testWhileLoop() {
        int i = 10;

        while (i > 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void testWhileLoopArray() {
        int[] arr = {2, 10, 6, 18, 99};

        int i = 4;

        while (i < arr.length) {
            System.out.println(arr[i]);
            i--;
        }
    }

    public static void testDoWhileLoop() {
        int i = 10;

        do {
            System.out.println(i);
            i--;
        } while (i > 1);
    }

    public static void testDoWhileLoopArray() {
        int[] arr = {2, 12, 5, 38};
        int i = 1;

        do {
            System.out.println(arr[i]);
            i++;
        } while (i < arr.length);
    }

    public static void testContinueStatement() {
        for (int i = 0; i <= 6; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void testBreakStatement() {
        int num;

        for (num = 100; num >= 10; num--) {
            System.out.println("num: " + num);
            if (num == 99) {
                break;
            }
        }
        System.out.println("Out of for loop");
    }
}
