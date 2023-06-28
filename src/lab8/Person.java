package lab8;

import java.security.InvalidParameterException;
import java.time.*;

public class Person {
    private final String name;
    private final String sex;
    private final String religion;
    protected final String language;
    private boolean job;
    private final String nationality;
    private final long EGN;
    private String dateOfBirth = "19";
    protected int age;
    private String countryOfResidence;

    public Person(String name, String sex, String religion, String language, boolean job, String nationality, long EGN, String countryOfResidence) {
        this.name = name;
        this.sex = isSexValid(sex);
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.EGN = Long.parseLong(String.valueOf(EGN).substring(0, 10));
        this.dateOfBirth = getDateOfBirth(String.valueOf(EGN));
        this.age = getAge(dateOfBirth);
        this.countryOfResidence = countryOfResidence;
    }

    private boolean isEGN_valid(String EGN) {
        if(EGN.length() == 10) {
            return true;
        } else {
            System.out.println("EGN is invalid!");
            throw new InvalidParameterException();
        }
    }

    String getDateOfBirth(String EGN) {
        isEGN_valid(EGN);

        for(int i = 0; i <= 5; i++) {
            dateOfBirth += EGN.charAt(i);

            if(i == 1){
                dateOfBirth += "-";
            } else if (i == 3) {
                dateOfBirth += "-";
            }

        }
        return dateOfBirth;
    }

    private int getAge(String dateOfBirth) {
        String birthYear = dateOfBirth.substring(0,4);
        int currentYear = LocalDate.now().getYear();
        String birthMonth = dateOfBirth.substring(5,7);
        int currentMonth = LocalDate.now().getMonthValue();

        if(currentMonth < Integer.parseInt(birthMonth)) {
            currentYear -= 1;
        }
        return currentYear - Integer.parseInt(birthYear);
    }

    private String isSexValid(String sex) {
        try {
            if(!(sex.equals("Male") || sex.equals("Female"))){
                throw new InvalidParameterException();
            }
        } catch (InvalidParameterException e){
            System.out.println("Invalid sex! Please enter Male or Female.");
        }
        return sex;
    }

    public void sayHello() {
        switch(language){
            case "Bulgarian":
                System.out.println("Здравей!");
                break;
            case "Italian":
                System.out.println("Ciao!");
                break;
            default:
                System.out.println("Hello!");
        }
    }

    public void celebrateEaster() {
        switch (religion){
            case "Orthodox":
            case "Catholic":
                System.out.println("The person celebrates Easter!");
                break;
            case "Islam":
                System.out.println("The person does not celebrate Easter!");
                break;
            default:
                System.out.println("We do not have information about your religion!");
        }
    }

    public void isAdult() {
        switch (countryOfResidence){
            case "Bulgaria":
            case "Italy":
                if(age >= 18) {
                    System.out.println("The person is an adult!");
                } else {
                    System.out.println("The person is not an adult!");
                }
                break;
            case "USA":
                if(age >= 21) {
                    System.out.println("The person is an adult!");
                } else {
                    System.out.println("The person is not an adult!");
                }
                break;
            default:
                System.out.println("We do not have information about your country!");
        }
    }

    public void canTakeLoan() {
        if(job){
            System.out.println("The person can take a loan!");
        } else {
            System.out.println("The person cannot take a loan!");
        }
    }
}
