package algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BobTest {

    @Test
    void enough() {
        assertEquals(0, Bob.enough(10, 5, 5), "Should return 0.");
        assertEquals( 10, Bob.enough(100, 60, 50), "Should return 10.");
        assertEquals( 0, Bob.enough(20, 5, 5), "Should return 0.");
    }
}