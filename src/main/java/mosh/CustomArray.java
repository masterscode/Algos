package mosh;

import java.util.Arrays;

public class CustomArray {
    private  int[] _array;
    private int index = 0;
    private int length;

    public CustomArray(int length){
        this.length= length;
        this._array = new int[this.length];
    }
    public void insert(int number) throws ArrayIndexOutOfBoundsException{
       if (length < index) this._array[index++] = number;
       if (length >= index ){
           length *= 2;
           _array = new int[length];

       }
    }

    public void println(){
        Arrays.stream(_array).forEach(System.out::println);
    }

    @Override
    public String toString(){
        return Arrays.toString(_array);
    }
}
