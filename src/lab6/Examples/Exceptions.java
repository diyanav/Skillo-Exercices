package lab6.Examples;

import java.io.*;

public class Exceptions {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        //testCheckedExceptions();
        //testUncheckedExceptions();

        String path = "src/lab6/Examples/testFile";

        //testTryCatch(path);
        //testTryCatchMultipleExceptions(20, 0);

        /*
        try {
            testThrowsException();
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFound exceptions!");
        }
        */

        //testThrowException(99, 0);
        testTryFinally(path);
    }

    static void testCheckedExceptions() throws FileNotFoundException {
        File file = new File("src/lab6/Examples/testFile");
        FileReader fr = new FileReader(file);
    }

    static void testUncheckedExceptions() {
        int[] num = {1, 2, 3, 4};
        System.out.println(num[5]);
    }

    static void testTryCatch(String path) {
        File file = new File(path);

        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found. Please check the file name and try again.");
        }
    }

    static void testTryCatchMultipleExceptions(int number, int factor) {
        try {
            if (number % factor == 0) {
                System.out.println(factor + " is a factor of " + number);
            }
        } catch (ArithmeticException | NumberFormatException ex) {
            System.out.println("Exception encounter " + ex);
        }
    }

    static void testThrowsException() throws FileNotFoundException {
        File file = new File("src/lab6/Examples/test6File");
        FileReader fr = new FileReader(file);
    }

    static void testThrowException(int number, int factor) {
        try {
            if (number % factor == 0) {
                System.out.println(factor + " is a factor of " + number);
            }
        } catch (ArithmeticException | NumberFormatException ex) {
            throw new IllegalArgumentException("Enter new number bigger than 0.");
        }
    }

    static void testTryFinally(String path) throws IOException {
        FileInputStream fis = null;
        BufferedReader in = null;

        try {
            fis = new FileInputStream(path);
            in = new BufferedReader(new InputStreamReader(fis));
            String line;

            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (in != null) {
                in.close();
            }

            if (fis != null) {
                fis.close();
            }
        }
    }
}

