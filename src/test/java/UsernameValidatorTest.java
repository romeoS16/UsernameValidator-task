import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UsernameValidatorTest {

    @Test
    public void simpleValidName_returnsTrue() {
        boolean result = UsernameValidator.isValidUsername("max");
        assertTrue(result);
    }

    // TODO: weitere Testfälle ergänzen
}
