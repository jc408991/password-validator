package hunt1.password_validator;

/**
 * Created by hunt1 on 2018-02-08.
 */

public class Validator {


    //This class has several methods that test the strength of a user inputted password

    //This method will return an int value of the length of the inputted string
    public int getPasswordLength(String password) {
        return password.length();
    }

    //This method a boolean value of whether the input string is "password" case insensitive
    public boolean lazyPassword(String password) {
        String s1 = "password";
        String s2 = password;
        return s1.equalsIgnoreCase(s2);
    }

}
