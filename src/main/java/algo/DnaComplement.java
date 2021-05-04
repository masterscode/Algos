package algo;

import java.util.HashMap;
import java.util.stream.Stream;

public class DnaComplement {
    /**
     * Deoxyribonucleic acid (DNA) is a chemical
     * found in the nucleus of cells and carries
     * the "instructions" for the development and
     * functioning of living organisms.
     * <p>
     * If you want to know more http://en.wikipedia.org/wiki/DNA
     * <p>
     * DNA is created by two strands of nucleotides that
     * are bonded together in complementary pairs.
     * For each base on one side, there is an opposite base
     * on the other side. There are 4 symbols used to represent
     * the bases, A, T, C, and G.
     * <p>
     * Symbols A and T are complements of each other, as are C and G.
     * <p>
     * Task
     * You have function with one side of the DNA, you need to get
     * the other complementary side. The DNA strand may be empty if
     * there is no DNA at all. In this case, you can simple return
     * the empty string.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(dnaComplement("ATTGC"));
    }

    public static String dnaComplement(String dna) {
        if (dna.equals("")) return "";
        final HashMap<String, String> complement = new HashMap<>();
        complement.put("T", "A");
        complement.put("A", "T");
        complement.put("C", "G");
        complement.put("G", "C");
        String[] dnas = dna.split("");
        String result = Stream.of(dnas)
                .map(complement::get)
                .reduce(String::concat).get();

        return result;
    }
}
