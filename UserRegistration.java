package practice;

import java.util.regex.*;

public class UserRegistration {
    String firstName;

    public UserRegistration(String firstName) {
        this.firstName = firstName;

    }

    String firstNamePattern = "[A-Z][a-z]{2,}";
    Pattern pattern = Pattern.compile(firstNamePattern);

    public void validateFirstNameInput() {
        boolean firstNameMatch=Pattern.matches(firstNamePattern,firstName);
        System.out.println(firstNameMatch);
    }
}
