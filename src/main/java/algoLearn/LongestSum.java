package algoLearn;

public class LongestSum {
    public int longestCommonSum(int[] arg, int[] arg2, int n) {
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0, sumOne = 0;
            for (int j = 0; j < n; j++) {
                sum += arg[j];
                sumOne += arg[j];

                if (sum == sumOne) {
                    int length = j - i + 1;
                    if (length > maxLength) maxLength = length;
                }
            }
        }
        return maxLength;
    }
}
