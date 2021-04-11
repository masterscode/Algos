package algo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpinWordTest {

    SpinWord spin;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        spin = new SpinWord();
    }

    @org.junit.jupiter.api.Test
    void spinWords() {

        assertEquals("emocleW", spin.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", spin.spinWords("Hey fellow warriors"));
    }

}
