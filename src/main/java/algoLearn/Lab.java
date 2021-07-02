package algoLearn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Lab {

    public static final String capsPrefix = "000001";
    public final String space = "000000";

    public static Map<String, String> createDictionary() {
        Map<String, String> brailleDictionary = new HashMap<String, String>();
        brailleDictionary.put("a", "100000");
        brailleDictionary.put("b", "110000");
        brailleDictionary.put("c", "100100");
        brailleDictionary.put("d", "100110");
        brailleDictionary.put("e", "100010");
        brailleDictionary.put("f", "110100");
        brailleDictionary.put("g", "110110");
        brailleDictionary.put("h", "110010");
        brailleDictionary.put("i", "010100");
        brailleDictionary.put("j", "010110");
        brailleDictionary.put("k", "101000");
        brailleDictionary.put("l", "111000");
        brailleDictionary.put("m", "101100");
        brailleDictionary.put("n", "101110");
        brailleDictionary.put("o", "101010");
        brailleDictionary.put("p", "111100");
        brailleDictionary.put("q", "111110");
        brailleDictionary.put("r", "111010");
        brailleDictionary.put("s", "011100");
        brailleDictionary.put("t", "011110");
        brailleDictionary.put("u", "101001");
        brailleDictionary.put("v", "111001");
        brailleDictionary.put("w", "010111");
        brailleDictionary.put("x", "101101");
        brailleDictionary.put("y", "101111");
        brailleDictionary.put("z", "101011");
        final Map<String, String> capsBraile = new HashMap<>();

        brailleDictionary.forEach((key, value) -> capsBraile.put(key.toUpperCase(), capsPrefix + value));

        brailleDictionary.putAll(capsBraile);
        brailleDictionary.put(" ", "000000");
        return brailleDictionary;
    }

    public static String translateToBraille(String toTranslate) {
        final Map<String, String> brailleDictionary = createDictionary();
        return Stream.of(toTranslate.split(""))
                .map(brailleDictionary::get)
                .reduce(String::concat)
                .orElse("");
    }
}
