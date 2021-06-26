package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinMax {
    public static void main(String[] args) {
        miniMaxSum(List.of(1,2,3,4,5));
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long max = arr.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList())
                .stream().skip(1).map(n->(long)n).reduce((Long::sum)).get();
        long min = arr.stream().sorted().collect(Collectors.toList()).stream().skip(1).map(n->(long)n).reduce(Long::sum).get();

        System.out.printf("%d %d",max,min);
    }
}
