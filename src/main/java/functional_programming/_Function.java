package functional_programming;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
       int increment =  increment(0);
    }

    Function<Integer, Integer> incrementFunction = number -> number++;

    static int increment(int number){
        return number + 1;
    }
}
