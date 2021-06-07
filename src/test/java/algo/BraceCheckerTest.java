package algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BraceCheckerTest {

    @Test
    public void testValid() {
        assertTrue(BraceChecker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertFalse(BraceChecker.isValid("[(])"));
    }
}