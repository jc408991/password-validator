package hunt1.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hunt1 on 2018-02-08.
 */
public class ValidatorTest {
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