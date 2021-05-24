package algo;

import java.util.Arrays;

public class FindOutlier {
    public static void main(String[] args) {
        System.out.println(find(new int[]{2,4,6,-8, 10}));
    }
    static int find(int[] integers){
        int oddCount = 0, evenCount = 0;
        int odd = 0, even = 0;
        for (int integer : integers) {
            if (integer % 2 == 0) {
                evenCount += 1;
                even = integer;
            } else {
                oddCount += 1;
                odd = integer;
            }
        }

        return oddCount < evenCount ? odd : even;
    }
}
