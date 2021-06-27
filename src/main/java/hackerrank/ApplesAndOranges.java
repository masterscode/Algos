package hackerrank;
import java.util.*;
import java.util.stream.Collectors;

public class ApplesAndOranges {
    public static void main(String[] args) {

        countApplesAndOranges(7,11,5,15,List.of(-2, 2, 1), List.of(5 ,-6));
    }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here

        final int houseStartingPoint = s;
        final int houseEndPoint = t;

        final int positionOfApples = a;
        final int positionOfOranges = b;

        final List<Integer> applesFinalLocation = apples.stream().map(apple -> apple + (positionOfApples)).collect(Collectors.toList());
        final List<Integer> orangesFinalLocation = oranges.stream().map(orange -> orange + (positionOfOranges)).collect(Collectors.toList());

        final long applesOnSamHouse = applesFinalLocation.stream().filter(value -> value >= houseStartingPoint && value<= houseEndPoint).count();
        final long orangesOnSamHouse = orangesFinalLocation.stream().filter(value -> value >= houseStartingPoint && value<= houseEndPoint).count();

        System.out.println(applesOnSamHouse);
        System.out.println(orangesOnSamHouse);

    }
}
