package algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingTest {

    @Test
    public void returnsCorrectCountsForSmallerStrings() {
        Integer expected0 = 3;
        Integer actual0 = Counting.counting("00110");
        assertEquals(expected0, actual0);
        Integer expected1 = 4;
        Integer actual1 = Counting.counting("10101");
        assertEquals(expected1, actual1);
        Integer expected2 = 2;
        Integer actual2 = Counting.counting("10001");
        assertEquals(expected2, actual2);
        Integer expected3 = 6;
        Integer actual3 = Counting.counting("00110011");
        assertEquals(expected3, actual3);
    }
}