import algo.DiagonalDifference;
import learn.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DiagonalDifference algo = new DiagonalDifference();
//        System.out.println(algo.getAddress("city"));
        Map<String, String> testMaps = new HashMap<>();
        Collections learnCollections = new Collections();
        learnCollections.testArrayList.forEach(System.out::println);

        ArrayList<Collections> items = new ArrayList<>();
        Iterator<Collections> iterate = items.iterator();

        for (int iterator = 0; iterator < 10; iterator++) {
            items.add(new Collections(String.format("collection %s  ", iterator), iterator));
        }
        items.forEach((new Collections())::print);
    }
}