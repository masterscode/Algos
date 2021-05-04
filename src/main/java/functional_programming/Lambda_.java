package functional_programming;

import interfaces.TypeLambda;

import java.util.List;
import java.util.function.BiConsumer;

public class Lambda_ {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(32,4,5,3,3,23,23,32,12,12,3,32,34,4);
        numbers
                .stream()
                .sorted( (v,o) -> v - o )
                .distinct()
                .forEach(System.out::println);
        BiConsumer<Integer, Integer> add = (Integer a, Integer b) -> System.out.println(a + b);
        TypeLambda makeMessage = (String message, String recipient) -> String.format("this %s is intended for %s", message, recipient);
    }
}
