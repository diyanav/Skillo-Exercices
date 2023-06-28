package lab8;

public class American extends Person {
    public American(String name, String sex, String religion, String language, boolean job, String nationality, long EGN, String countryOfResidence) {
        super(name, sex, religion, language, job, nationality, EGN, countryOfResidence);
    }

    @Override
    public void isAdult() {
        if(age >= 21) {
            System.out.println("The person is an adult!");
        } else {
            System.out.println("The person is not an adult!");
        }
    }
}
