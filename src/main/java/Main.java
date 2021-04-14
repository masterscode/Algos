import algo.DiagonalDifference;
import algo.PackArray;
import learn.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PackArray pack = new PackArray();
        System.out.println(
                pack.packArray(
                        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
                )
        );
    }
}