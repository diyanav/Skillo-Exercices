package lab8;

public class Exercices {
    public static void main(String[] args) {
        Person bulgarian = new Bulgarian("Maria", "Female", "Catholic", "Bulgarian", true, "Bulgarian", 9912248692L, "Bulgaria");
        Person italian = new Italian("Pablo", "Male", "Orthodox", "Italian", true, "Italian", 9403247997L, "USA");
        Person french = new Person("Audrey", "Female", "Islam", "French", false, "French", 9006298750L, "France");

        bulgarian.sayHello();
        ((Bulgarian) bulgarian).isRealBulgarian();
    }
}
