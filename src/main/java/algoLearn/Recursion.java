package algoLearn;

public class Recursion {
    public static void main(String[] args) {
//        System.out.println(addRanges(0, 5));
//        System.out.println(power(3,3));
//        System.out.println(GCD(120,8));
//        System.out.println(imperatively(10));
        System.out.println(decimalToBinary(4));
    }

    //calculate the power of a number using recursion!
    public static int power(int base, int exponent) {
        return exponent >= 1 ? base * power(base, exponent - 1):1;
        //cannot return base or exponent because final computation will be multiplied by base
        // and exponent will be zero and gie a product of 0
    }

    //greatest common divisor GCD
    //GCD - is the max value that can divide a number without any remainder.
    // using Euclidean algorithm -- gcd(a, 0) == a; gcd(a, b) == gcd(b, a mod b)
    public static int GCD(int a, int b){
        return b > 0 ? GCD(b , a % b) : a;
    }

    //sum the values between two numbers
    public static int addRanges(int start, int end) {
        return start < end ? start + addRanges(start + 1, end) : start;
    }

//    decimal to binary
    public static int decimalToBinary(int decimal) {
        return decimal > 0 ? decimal % 2 + 10 * decimalToBinary(decimal / 2): 0;
    }
    public static int imperatively(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
