package algo;

import java.util.List;

public class PackArray {
    public static Integer packArray( List<Integer> arr ) {
        int sum = 0;
        if(arr.size() < 1 || arr.size() > (int) Math.pow(2,5)) return Integer.parseInt( arr.toString());
        for (int iteration = 0; iteration < arr.size(); iteration++ ){
            if(iteration == 0){
                arr.set(iteration, arr.get(iteration));
            }
            if(iteration % 2 == 1){
                arr.set(iteration, arr.get(iteration) + arr.get(iteration + 1));
                arr.remove(iteration + 1);
            }

            if(iteration % 2 == 0 && iteration > 0){
                arr.set(iteration, arr.get(iteration) * arr.get(iteration + 1));
                arr.remove(iteration + 1);
            }

        }
        return Integer.parseInt( arr.toString());
    }
}
