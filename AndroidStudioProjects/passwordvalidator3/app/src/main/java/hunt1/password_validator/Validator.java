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

    //This method returns a boolean value of whether the input string is "password" case insensitive
    public boolean lazyPassword(String password) {
        String s1 = "password";
        String s2 = password;
        return s1.equalsIgnoreCase(s2);
    }

    //Method that returns a boolean value if the inputted string contains a space character
    public boolean containsNoSpace(String password) {
        return password.contains(" ");
    }

    //Method that tests whether a password contains at least one digit from 0-9
    public int containsDigits(String password) {
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == '0' || password.charAt(i) == '1' || password.charAt(i) == '2'
               || password.charAt(i) == '3' || password.charAt(i) == '4' || password.charAt(i) == '5'
               || password.charAt(i) == '6' || password.charAt(i) == '7' || password.charAt(i) == '8'
               || password.charAt(i) == '9') {
                count++;
            }
        }
        return count;
    }

    //Method that tests whether a password has at least one capitalized letter in it
    public int containsCapital(String password) {
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == 'A' || password.charAt(i) == 'B' || password.charAt(i) == 'C'
                    || password.charAt(i) == 'D' || password.charAt(i) == 'E' || password.charAt(i) == 'F'
                    || password.charAt(i) == 'G' || password.charAt(i) == 'H' || password.charAt(i) == 'I'
                    || password.charAt(i) == 'J' || password.charAt(i) == 'K' || password.charAt(i) == 'L'
                    || password.charAt(i) == 'M' || password.charAt(i) == 'N' || password.charAt(i) == 'O'
                    || password.charAt(i) == 'P' || password.charAt(i) == 'Q' || password.charAt(i) == 'R'
                    || password.charAt(i) == 'S' || password.charAt(i) == 'T' || password.charAt(i) == 'U'
                    || password.charAt(i) == 'V' || password.charAt(i) == 'W' || password.charAt(i) == 'X'
                    || password.charAt(i) == 'Y' || password.charAt(i) == 'Z') {
                count++;
            }
        }
        return count;
    }

}
