package algo;

import java.util.HashMap;
import java.util.Map;

public class Week11Algorithm {

    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutDuplication("emmanuel"));
    }

    public static String longestSubstringWithoutDuplication(String str) {
        // Write your code here
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < str.length(); end++) {
            char current = str.charAt(end);
            if (visited.containsKey(current)) {
                start = Math.max(visited.get(current)+1, start);
            }
            if (output.length() < end - start + 1) {
                output = str.substring(start, end + 1);
            }
            visited.put(current, end);
        }
        return output;
    }

}
