
/*
 * Name Validation
 * true if the character is a letter (A-Z, a-z) or a digit (0-9).
 * false otherwise.
 * 
 */


package day2;
import java.util.*;

public class NameValidation {

    static boolean isValid(String name){
        for(char ch:name.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if(isValid(name)){
            System.out.println("Your Name is validated successfully!!");
        }
        else{
            System.out.println("Please enter valid name!!!");
        }
        scanner.close();
    }
}
