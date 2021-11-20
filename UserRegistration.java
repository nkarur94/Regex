package practice;

import java.util.regex.*;

public class UserRegistration {
    String firstName;
    String lastName;

    //constructor-parametrized
    public UserRegistration(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName=lastName;

    }

    String firstNamePattern = "[A-Z][a-z]{2,}";
    String lastNamePattern="[A-z][a-z]{2,}";//creating the pattern to match this rules

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

}
