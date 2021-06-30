package algoLearn;

public class Recursion {
    public static void main(String[] args) {
        //
//        System.out.println(addRanges(10));
        System.out.println(imperatively(10));
    }

    public static int addRanges(int number){
        if (number <= 0) return number;
        return number + addRanges(number - 1);
    }

    public static int imperatively(int number){
        int sum = 0;
        for (int i = 0; i <= number; i++){
            sum += i;
        }
        return sum;
    }
}
