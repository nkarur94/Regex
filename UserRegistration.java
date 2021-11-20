package practice;

import java.util.regex.*;

public class UserRegistration {
    String firstName;
    String lastName;
    String eMailId;

    //constructor-parametrized
    public UserRegistration(String firstName, String lastName, String eMailId) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.eMailId=eMailId;

    }

    String firstNamePattern = "[A-Z][a-z]{2,}";
    String lastNamePattern="[A-Z][a-z]{2,}";//creating the pattern to match this rules
    String eMailIdPattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,6}$";

    //this method is used to validate firstname
    public void validateFirstNameInput() {
        boolean firstNameMatch=Pattern.matches(firstNamePattern,firstName);
        System.out.println(firstNameMatch);
    }

    //this method is used to validate last name
    public void validateLastNameInput() {
        boolean lastNameMatch=Pattern.matches(lastNamePattern,lastName);
        System.out.println(lastNameMatch);
    }

    public void validateEMailId(){
        boolean eMailIdMatch=Pattern.matches(eMailIdPattern,eMailId);
        System.out.println(eMailIdMatch);
    }

}
