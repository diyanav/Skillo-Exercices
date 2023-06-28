package lab8;

public class Italian extends Person {
    public Italian(String name, String sex, String religion, String language, boolean job, String nationality, long EGN, String countryOfResidence) {
        super(name, sex, religion, language, job, nationality, EGN, countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao!");
    }
}
