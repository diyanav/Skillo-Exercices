package lab7.Examples;

public class Examples {
    public static void main(String[] args) {
        //testObjectCreation();
        //testFinalAttribute();
        //testClassMethods();
        //testClassConstructor();

        /*
        BankAccount bankAccount = new BankAccount("Diyana");
        bankAccount.makeTransaction(10.44);
        System.out.println(bankAccount.getAccountBalance());
        System.out.println(bankAccount.getOwnerName());
         */

        //Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 125.5, 40.7, 1200, 600, 350);

        /*
        Animal animal = new Animal();
        animal.animalSound();

        Animal dog = new Dog();
        dog.animalSound();
        */
    }

    static void testObjectCreation() {
        Object myObject = new Object();
        Object myObject1 = new Object();

        System.out.println(myObject.x);

        myObject1.y = 10;

        System.out.println(myObject1.y);
        System.out.println(myObject.y);
    }

    static void testFinalAttribute() {
        Object myObject = new Object();
        System.out.println(myObject.z);
    }

    static void testClassMethods() {
        //Object.printHello();

        Object myObject = new Object();
        myObject.printHelloOfObject();
    }

    static void testClassConstructor() {
        Car car1 = new Car("BMW", 350);
        System.out.println(car1.brand);
        System.out.println(car1.model);

        Car car2 = new Car("Mercedes", "S", 500, 400);
        System.out.println("Brand: " + car2.brand + "Model: " + car2.model);
    }
}
