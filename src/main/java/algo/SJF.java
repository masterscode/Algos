package algo;

import java.util.List;

public class SJF {
    public static Integer sjf(List<Integer> jobs, Integer index ) {

        final Integer payload = jobs.get(index);

        return jobs.stream()
                .sorted()
                .filter(job -> job <= payload)
                .reduce(Integer::sum)
                .orElseGet(()->payload);


    }
}
