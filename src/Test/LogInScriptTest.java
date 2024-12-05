import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogInScriptTest {
    @Test
    void testLogInScriptLogin() {
        UserValid userValid = new UserValid();

        boolean result = userValid.isValid("John", "John1234");
        assertTrue(result);
    }

    @Test
    void testLogInScriptFailure() {
        UserValid userValid = new UserValid();
        boolean result = userValid.isValid("John", "John123");
        assertFalse(result);


    }

    @Test
    void testLogInScriptBlankSpace() {
        UserValid userValid = new UserValid();
        boolean result = userValid.isValid("", "John123");
        assertFalse(result);
    }

}