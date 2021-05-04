package algo;

public class FlipVerticalAxis {

    public static void flipItVerticalAxis(int[][] matrix) {
        int[][] result = new int[2][2];

        int[][] args = matrix;
        result[0] = new int[]{ args[0][1], args[0][0]};
        result[1] = new int[]{ args[0][1], args[0][0]};

    }
}
