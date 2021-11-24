package practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);

        System.out.println("enter the first name");
        String firstName=userInput.nextLine();
        System.out.println("enter the last name");
        String lastName=userInput.nextLine();
        System.out.println("enter the email id");
        String eMailId=userInput.nextLine();
        System.out.println("enter the mobile no");
        String mobileNo=userInput.nextLine();
        System.out.println("enter the password");
        String password=userInput.nextLine();



        UserRegistration validate=new UserRegistration(firstName,lastName,eMailId, mobileNo, password);

        validate.validateFirstNameInput();
        validate.validateLastNameInput();
        validate.validateEMailId();
        validate.validateMobileNo();
        System.out.println(validate.validatePassword());
    }
}
