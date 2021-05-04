package algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountChangeTest {
    @Test
    public void shouldHandleTheExampleCase() {
        Integer expected = 3;
        Integer actual = CountChange.countChange(4, Arrays.asList(1,2));
        assertEquals(expected, actual);
    }
    @Test
    public void shouldHandleAnotherSimpleCase() {
        Integer expected = 4;
        Integer actual = CountChange.countChange(10, List.of(5, 2, 3));
        assertEquals(expected, actual);
    }

}