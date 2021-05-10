package algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaskifyTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void maskify() {
            assertEquals("############0694", Maskify.maskify("5512103073210694"));
            assertEquals("#4321", Maskify.maskify("54321"));
            assertEquals("21", Maskify.maskify("21"));
            assertEquals("####################################man!", Maskify.maskify("Nananananananananananananananana Batman!"));
            assertEquals("", Maskify.maskify(""));
        }
    }