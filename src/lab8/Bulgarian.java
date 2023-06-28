package lab8;

import java.security.InvalidParameterException;

public class Bulgarian extends Person{
    public Bulgarian(String name, String sex, String religion, String language, boolean job, String nationality, long EGN, String countryOfResidence) {
        super(name, sex, religion, language, job, nationality, EGN, countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравей!");
    }

    public void isRealBulgarian() {
        if(language.equals("Bulgarian")) {
            System.out.println("The person is real bulgarian!");
        } else {
            System.out.println("Invalid language!");
            throw new InvalidParameterException();
        }
    }
}
