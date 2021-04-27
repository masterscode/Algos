package algo;

import java.util.HashMap;
import java.util.regex.Pattern;

public class Counting {
    public static Integer counting( String s ) {
        int counter = 0, previous = 0, current = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                counter += Math.min(previous, current);
                previous = current;
                current = 1;
            } else {
                current++;
            }
        }
        return counter + Math.min(previous, current);
    }
    }

