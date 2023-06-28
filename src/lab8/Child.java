package lab8;

public class Child extends Person{

    public Child(String name, String sex, String religion, String language, boolean job, String nationality, long EGN, String countryOfResidence) {
        super(name, sex, religion, language, job, nationality, EGN, countryOfResidence);
    }

    @Override
    public void isAdult() {
        System.out.println("The person is not an child!");
    }

    @Override
    public void canTakeLoan() {
        System.out.println("The person cannot take a loan!");
    }
}
