package data_structures;

public class BasicStack<T> {
    private T data[];
    private int length, stackPointer;

    public BasicStack(int length){
        this.length = length;
        data = (T[]) new Object[this.length];
        this.stackPointer = 0
    }

    public void push(T element){
        data[stackPointer++] = element;
    }

    public T pop(){
        if (this.stackPointer == 0){
            throw new IllegalStateException("stack underflow");
        }
        return this.data[--stackPointer];
    }

    public boolean contains(T element){
        boolean contains =  false;
        for(int i = 0; i < stackPointer; i++){
            if(data[i].equals(element)){
                contains = true;
                break;
            }
        }
        return contains;
    }

    public T access(T element){
        T temp;
        while(stackPointer > 0){

        }
    }


}
