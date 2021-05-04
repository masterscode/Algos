package algo;

public class Swapper {
    /**
     * I would like to be able to pass an array with two elements
     * to my swapValues function to swap the values.
     * However it appears that the values aren't changing.
     */

    public Object[] arguments;

    public Swapper(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object[] args = {arguments[1],arguments[0]};
        arguments = args;
    }
}
