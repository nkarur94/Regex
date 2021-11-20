package practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);

        System.out.println("enter the first name");
        String firstName=userInput.nextLine();

        List<UserRegistration> arrayList=new ArrayList<UserRegistration>();
        arrayList.add(new UserRegistration(firstName));
        UserRegistration validate=new UserRegistration(firstName);

        validate.validateFirstNameInput();
    }
}
