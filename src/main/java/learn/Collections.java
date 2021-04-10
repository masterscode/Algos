package learn;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections {
    public String name;
    private int count;

    public ArrayList<Integer> testArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,3,5,4,3,2));

    public Collections(String name, int count){
        this.name = name;
        this.count = count;
    }
    public Collections(){
//        if(name.isEmpty())name = "";
    }
    public void print(Collections item){
        System.out.println(item.name + count);
    }
}
