package TP1.LineCoverageTest;
import org.example.TP1.Anagram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo2Test {
    @Test
    void testNullStrings() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test"));
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("test", null));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
    }

    @Test
    void testValidAnagrams() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    void testInvalidAnagrams() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }
}
