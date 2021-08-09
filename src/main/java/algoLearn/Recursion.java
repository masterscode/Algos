package algoLearn;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recursion {
    public static void main(String[] args) {

    }

    //calculate the power of a number using recursion!
    public static int power(int base, int exponent) {
        return exponent >= 1 ? base * power(base, exponent - 1):1;
        //cannot return base or exponent because final computation will be multiplied by base
        // and exponent will be zero and give a product of 0
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

    public static String reverseWord(String word){
        if (word.equals("")){
            return word;
        }
        return reverseWord(word.substring(1)) + word.charAt(0);
    }

    public static boolean isPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1) return true;
        if (word.charAt(0)  == word.charAt(word.length() - 1)){
            return isPalindrome(word.substring(1, word.length() - 1));
        }

        return false;
    }

    public String convertToBinary(int number, String result) {
        if (number == 0) return result;
        result = number % 2 + result;
        return convertToBinary(number / 2, result);
    }
}



/*
 * public static int countOfNumbersThatMetTheCriteria(int k, List<Integer> scores){
 *         Map<Integer,Integer> scoreSheet = new HashMap<Integer,Integer>();
 *
 *         for (int value : scores){
 *             if (scoreSheet.containsKey(value)){
 *                 scoreSheet.put(value, scoreSheet.get(value) + 1);
 *             }
 *             scoreSheet.put(value,  1);
 *         }
 *         return (int) scoreSheet.values().stream().filter(v -> v >= k).count();
 *     }
 */