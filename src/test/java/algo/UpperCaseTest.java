package algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {
    UpperCase upper;
    @BeforeEach
    void setUp(){
        upper = new UpperCase();
    }
    @Test
    void makeUpperCase() {
            assertEquals("HELLO",upper.MakeUpperCase("hello"));
        }
}