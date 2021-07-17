package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BetweenTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
//
//    public static int getTotalX(List<Integer> a, List<Integer> b) {
//        // Write your code here
//        return 0;
//    }
    public static void main(String[] args) {
        System.out.println(
                getTotalX(List.of(2,6), List.of(24,36))
        );
    }

    public static int getTotalX(List<Integer> elementsA, List<Integer> elementsB) {
        // Write your code here
        List<Integer> firstCriteria = new ArrayList<>();
        int countOfNumbersThatMetTheCriteria = 0;
        List<Integer> numbersToFactor = IntStream
                                .range(elementsA.get(0),
                                        elementsB.get(elementsB.size() - 1) + 1)
                                .boxed()
                                .collect(Collectors.toList());
        System.out.println(numbersToFactor);
        for (int numberToFactor: numbersToFactor) {
            for (Integer integer : elementsA) {
                if (numberToFactor % integer == 0) firstCriteria.add(numberToFactor);
            }
        }
        System.out.println("first -- c" +firstCriteria);

        for (int nextStepNumber: firstCriteria) {
            for (int index = 0; index < elementsA.size(); index++) {
                if (elementsB.get(index) % nextStepNumber   == 0) countOfNumbersThatMetTheCriteria++;
            }
        }
        return countOfNumbersThatMetTheCriteria;
    }

}

