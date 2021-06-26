package hackerrank;

import java.util.List;

/**
 * You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
 *
 * Example
 *
 *
 * The maximum height candles are  units high. There are  of them, so return .
 */
public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = candles.stream().max(Integer::compare).get();
        return (int) candles.stream().filter(v -> v == max).count();
    }
}
