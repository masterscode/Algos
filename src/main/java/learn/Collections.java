package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collections {
    public String name;
    private int count;

    Queue<String> foodList = new PriorityQueue<>();


    public ArrayList<Integer> testArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,3,5,4,3,2));

    public Collections(String name, int count){
        this.name = name;
        this.count = count;
    }
    public Collections(){
    }
    public void print(Collections item){
        System.out.println(item.name + count);
    }
}
