package lab7.Examples;

public class Object {
    int x = 5;
    int y = 9;

    final int z = 11;

    public Object() {
        System.out.println("Object was created.");
    }

    static void printHello() {
        System.out.println("Hello. This method can be called WITHOUT creating an object of Object.");
    }

    public void printHelloOfObject() {
        System.out.println("Hello. This method can be called only if you create an object of Object.");
        System.out.println("The value of x is: " + this.x);
    }
}
