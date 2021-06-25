package hackerrank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
 *
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
 *
 * Example
 *
 * There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
 *
 * 0.400000
 * 0.400000
 * 0.200000
 */
public class PlusMinus {
    public static void main(String[] args) {
        plusMinus(List.of(1,2,3544,0,0,0,0,0,0,-23,-234,-2342));
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
         int listSize = arr.size();
         double zeroCount = (double) arr.stream().filter(value -> value == 0).count();
         double negativeCount = (double) arr.stream().filter(value -> value < 0).count();
         double positiveCount = (double) arr.stream().filter(value -> value > 0).count();
        System.out.println(BigDecimal.valueOf(positiveCount / listSize).setScale(6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(negativeCount / listSize).setScale(6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(zeroCount / listSize).setScale(6, RoundingMode.HALF_UP));


    }
}
