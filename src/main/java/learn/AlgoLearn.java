package learn;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AlgoLearn {

    public static void main(String[] args) {
        int num = 044;
//        int  n = 3;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.printf("var i: %s, var j: %s %n", i, j);
//            }
//        }

        StringBuilder str = new StringBuilder("reverse").reverse();
        IntStream.range(0, Integer.MAX_VALUE).forEach(System.out::println);
    }

    public static void testSolution() {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        int pd = 0, npd = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i)
                    pd = pd + a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - j - 1) {
                    npd = npd + a[i][j];
                }
            }
        }
        int dif = npd - pd;
        dif = Math.abs(dif);
        System.out.println(dif);
    }
}
