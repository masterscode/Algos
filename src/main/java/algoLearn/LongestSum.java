package algoLearn;

public class LongestSum {
    public static void main(String[] args) {
        System.out.println(longestCommonSum(new int[] {0,10,0,1,1,1,1}, new int[]{61,1,91,1,1,0,10},2));
    }
    public static int longestCommonSum(int[] arg, int[] arg2, int n) {
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0, sumOne = 0;
            for (int j = i; j < n; j++) {
                sum += arg[j];
                sumOne += arg[j];

                if (sum == sumOne) {
                    int len = j - i + 1;
                    if (len > maxLength) maxLength = len;
                }
            }
        }
        return maxLength;
    }
}
