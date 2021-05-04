package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClassExercise {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 4, 5, 6, 4));
        var list = numbers.stream()
                .map( m -> m + 1 )
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
