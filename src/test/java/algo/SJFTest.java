package algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SJFTest {

    @Test
    public void shouldHandleTheExample() {
        Integer expected = 6;
        Integer actual = SJF.sjf(Arrays.asList(3,10,20,1,2),0);
        assertSame(expected, actual);
        assertSame(26, SJF.sjf(Arrays.asList(3,10,10,20,1,2),2));
        assertSame(40, SJF.sjf(Arrays.asList(10,10,10,10),3));
    }
}