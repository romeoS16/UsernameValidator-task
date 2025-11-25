import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UsernameValidatorTest {

    @Test
    public void simpleValidName_returnsTrue() {
        boolean result = UsernameValidator.isValidUsername("max");
        assertTrue(result);
    }

    @Test
    public void minLengthValid_returnsTrue() {
        assertTrue(UsernameValidator.isValidUsername("abc"));
    }

    @Test
    public void belowMinLength_returnsFalse() {
        assertFalse(UsernameValidator.isValidUsername("ab"));
    }

    @Test
    public void maxLengthValid_returnsTrue() {
        // 15 Zeichen
        assertTrue(UsernameValidator.isValidUsername("abcdefghijklmno"));
    }

    @Test
    public void aboveMaxLength_returnsFalse() {
        // 16 Zeichen
        assertFalse(UsernameValidator.isValidUsername("abcdefghijklmnop"));
    }

    @Test
    public void startsWithDigit_returnsFalse() {
        assertFalse(UsernameValidator.isValidUsername("1start"));
    }

    @Test
    public void startsWithUnderscore_returnsFalse() {
        assertFalse(UsernameValidator.isValidUsername("_user"));
    }

    @Test
    public void containsSpace_returnsFalse() {
        assertFalse(UsernameValidator.isValidUsername("max mustermann"));
    }

    @Test
    public void containsSpecialCharacter_returnsFalse() {
        assertFalse(UsernameValidator.isValidUsername("user!"));
        assertFalse(UsernameValidator.isValidUsername("max-mustermann"));
        assertFalse(UsernameValidator.isValidUsername("hallo&bin"));

    }

    @Test
    public void validWithDigitsAndUnderscore_returnsTrue() {
        assertTrue(UsernameValidator.isValidUsername("Alice_01"));
        assertTrue(UsernameValidator.isValidUsername("User123"));
    }

    @Test
    public void emptyString_returnsFalse() {
        assertFalse(UsernameValidator.isValidUsername(""));
    }

    @Test
    public void nullInput_returnsFalse() {
        assertFalse(UsernameValidator.isValidUsername(null));
    }


}
