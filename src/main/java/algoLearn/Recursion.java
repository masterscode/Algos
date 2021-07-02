package algoLearn;

public class Recursion {
    public static void main(String[] args) {
        //
        System.out.println(addRanges(0, 5));
//        System.out.println(imperatively(10));
    }

    public static int addRanges(int start, int end) {
        if (start < end) return start + addRanges(start + 1, end);
        return start;
    }

    public static int imperatively(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
