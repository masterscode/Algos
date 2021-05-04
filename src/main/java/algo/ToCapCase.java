package algo;

import java.util.*;
import java.util.regex.Pattern;

public class ToCapCase {
    public static void main(String[] args) {

//        System.out.println(toCapCase("emma is nuel"));
        Set<String> uniq = Set.of("emmanuel", "james", "emmanuel", "paul", "Paul", "Emmanuel");

    }
    /**
     * Task
     * Write a function toCapCase(s) which capitalizes every word in the non-null
     * (but possibly empty) string s. A word is defined as a series of characters
     * bordered by space characters and/or the start or end of the string on either side.
     * For the purposes of this challenge, punctuation is considered part of a word as
     * a non-space character.
     *
     * Any ASCII characters in the inclusive range 0-127 may exist in s
     */

    public static String toCapCase(String s) {
        StringBuilder output = new StringBuilder();
        Pattern wordbreaker = Pattern.compile("(?im) ",Pattern.MULTILINE);
        String[] splittedWord = s.split(String.valueOf(wordbreaker));
        for (int i = 0; i < splittedWord.length; i++){
            String aWord = splittedWord[i];
            String firstChar = aWord.substring(0,1);
            aWord = firstChar.toUpperCase(Locale.ROOT) + aWord.substring(1) + " ";
            output.append(aWord);
        }
        return output.toString().trim();
    }



    public void overloader(List<Integer> loader){}

}
