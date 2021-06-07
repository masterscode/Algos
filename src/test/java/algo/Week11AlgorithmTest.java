package algo;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week11AlgorithmTest {

    @Test
    public void TestCase1() {
        assertEquals("mentisac", Week11Algorithm.longestSubstringWithoutDuplication("clementisacap"));
    }

    @Test
    public void TestCase2() {
        assertEquals("a", Week11Algorithm.longestSubstringWithoutDuplication("a"));
    }

    @Test
    public void TestCase3() {
        assertEquals("abc", Week11Algorithm.longestSubstringWithoutDuplication("abc"));
    }

    @Test
    public void TestCase4() {
        assertEquals("abc", Week11Algorithm.longestSubstringWithoutDuplication("abcb"));
    }

    @Test
    public void TestCase5() {
        assertEquals("abcdef", Week11Algorithm.longestSubstringWithoutDuplication("abcdeabcdefc"));
    }

    @Test
    public void TestCase6() {
        assertEquals("cdea", Week11Algorithm.longestSubstringWithoutDuplication("abccdeaabbcddef"));
    }

    @Test
    public void TestCase7() {
        assertEquals("bac", Week11Algorithm.longestSubstringWithoutDuplication("abacacacaaabacaaaeaaafa"));
    }

    @Test
    public void TestCase8() {
        assertEquals("dabcef", Week11Algorithm.longestSubstringWithoutDuplication("abcdabcef"));
    }

    @Test
    public void TestCase9() {
        assertEquals("cbde", Week11Algorithm.longestSubstringWithoutDuplication("abcbde"));
    }

    @Test
    public void TestCase10() {
        assertEquals("vsindecago", Week11Algorithm.longestSubstringWithoutDuplication("decadevsindecagonarelit"));
    }
}
