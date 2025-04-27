package TP1;

import org.example.TP1.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo1Test {
    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    void testSingleChar() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    void testPalindromeEvenLength() {
        assertTrue(Palindrome.isPalindrome("abba"));
    }

    @Test
    void testPalindromeOddLength() {
        assertTrue(Palindrome.isPalindrome("abcba"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("abca"));
    }

    @Test
    void testPalindromeWithSpaces() {
        assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));
    }
}

