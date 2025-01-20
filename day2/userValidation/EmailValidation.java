package day2.userValidation;

import java.util.*;
import java.util.regex.*;

public class EmailValidation {
    static boolean isValidEmail(String email){
        if(email.equals("")) return false;
        String regex = "^[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        if(!isValidEmail(email)){
            System.out.println("Please enter a valid email");
        }
        else{
            System.out.println("Email valided successfully!!");
        }
        scanner.close();
    }
}
