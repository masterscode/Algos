package hackerrank;


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Staircase detail
 *
 * This is a staircase of size :
 *
 *    #
 *   ##
 *  ###
 * ####
 * Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 *
 * Write a program that prints a staircase of size .
 *
 * Function Description
 *
 * Complete the staircase function in the editor below.
 *
 * staircase has the following parameter(s):
 *
 * int n: an integer
 */
public class Staircase {
    public static void main(String[] args) {
        staircase(4);
    }
    public static void staircase(int n) {
        // Write your code here
        IntStream.range(1,n + 1).boxed().sorted(Collections.reverseOrder()).forEach(i->{
            String prefix = " ".repeat(i - 1);
            System.out.println(prefix + "#".repeat(n - prefix.length()));
        });
    }
}
