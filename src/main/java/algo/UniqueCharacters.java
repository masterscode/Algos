package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(areAllCharactersUnique(""));
    }
    public static boolean areAllCharactersUnique(String str){
        boolean isTrue = false;
        ArrayList<String> words = new ArrayList<>(str.length());
        String[] strChars = str.split("");

        if(str == null || str.isEmpty()) return true;
        for(int iter = 0; iter < strChars.length; iter++){
            if(words.contains(strChars[iter])) continue;
            else words.add(strChars[iter]);
        }

        return words.size() == strChars.length;
    }
}
