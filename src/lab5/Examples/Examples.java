package lab5.Examples;

public class Examples {
    public static void main(String[] args) {
        //testMethod();
        //printFirstName("Diyana");
        //printPersonAge("Diyana", 23);
        //checkAge(23);

        /*
        //overloading
        System.out.println(calculateSum(5, 6));
        System.out.println(calculateSum(5, 6, 7));
        System.out.println(calculateSum(2.56, 4.5));
        */

        /*
        //overriding
        Dog dog = new Dog();
        dog.displayInfo();

        Animal animal = new Animal();
        animal.displayInfo();
        */
    }

    public static void testMethod(){
        int x = 5;
        int y = 6;

        System.out.println(calculateSum(x, y));
        myMethod();
    }

    static int returnSum(int x, int y){
        int sum = x + y;
        return sum;
    }

    static void myMethod(){
        System.out.println("I have just executed.");
    }

    static void printFirstName(String firstName){
        System.out.println("My first name is " + firstName);
    }

    static void printPersonAge(String firstName, int age){
        System.out.println(firstName + " is " + age + " years old");
    }

    static void checkAge(int age){
        if(age < 18){
            System.out.println("Access denied = You are not old enough!");
        }
        else {
            System.out.println("Access granted = You are old enough!");
        }
    }

    //overloading
    static int calculateSum(int x, int y) {
        return x + y;
    }

    static int calculateSum(int x, int y, int z) {
        return x + y + z;
    }

    static double calculateSum(double x, double y) {
        return x + y;
    }

}
