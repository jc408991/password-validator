package hunt1.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hunt1 on 2018-02-08.
 */
public class ValidatorTest {
    @Test
    public void containsCapital() throws Exception {
        String oneCapital = "1CapPass";
        Validator capitalTest = new Validator();
        int numCaps = capitalTest.containsCapital(oneCapital);
        assertTrue(numCaps > 0);
    }

    @Test
    public void containsDigits() throws Exception {
        boolean containsADigit;

        String oneDigit = "1DigitPass";
        Validator digitTest = new Validator();
        int numOfDigits = digitTest.containsDigits(oneDigit);
        assertTrue(numOfDigits > 0);
    }

    @Test
    public void containsNoSpace() throws Exception {
        boolean contains;
        String testPassword = "Password";
        Validator spaceTest = new Validator();
        contains = spaceTest.containsNoSpace(testPassword);
        assertFalse(contains);
    }

    @Test
    public void getPasswordLength() throws Exception {
        int passLength = 0;
        boolean greaterThan7 = false;
        String testPassword = "pAsSwOrD";
        Validator lengthTest = new Validator();
        passLength = lengthTest.getPasswordLength(testPassword);
        if (passLength > 7) {
            greaterThan7 = true;
        }
        assertTrue(greaterThan7);
    }



    @Test
    public void lazyPassword() throws Exception {
        String testPassword = "pAsSwOrD";
        Boolean lazy = false;
        Validator lazyTest = new Validator();
        lazy = lazyTest.lazyPassword(testPassword);
        assertTrue(lazy);
    }
}