package algo;

public class ReverseString {
    public static void main(String[] args) {
//        System.out.println(reverseString("emma"));
        System.out.println(reverseString("emmanuel"));
    }
    public static String reverseString(String str){
        String inputString = str;
        StringBuilder outputString = new StringBuilder();

        for (int iterator = inputString.length() -1; iterator > -1;iterator--){
            outputString.append(inputString.charAt(iterator));
        }

        return outputString.toString();
    }

}


