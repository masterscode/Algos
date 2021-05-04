package algo;

import java.util.List;

public class CountChange {

    /**
     * Write a function that counts how many different ways you can make change for an amount of money given an array of coin denominations. For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2:
     *
     * 1+1+1+1, 1+1+2, 2+2.
     * The order of coins does not matter:
     *
     * 1+1+2 == 2+1+1
     * Also, assume that you have an infinite ammount of coins.
     *
     * Your function should take an amount to change and an array of unique denominations for the coins:
     *
     *   Challenge.countChange(4, Arrays.asList(1,2)) // => 3
     *   Challenge.countChange(10, Arrays.asList(5,2,3)) // => 4
     *   Challenge.countChange(11, Arrays.asList(5,7)) //  => 0
     */

    public static Integer countChange(Integer money, List<Integer> coins ) {
        int count = 0;
        if (coins.size() == 1){
            if (money % coins.get(0) == 0) return 1;
            else return  0;
        }

        int last = coins.get(coins.size() - 1);
        coins.remove(coins.size() - 1);
        for (int i=0; i < money / last; i++){
            count += countChange(money -i * last, coins);
        }
        return count;
    }
}
