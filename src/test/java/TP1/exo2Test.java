package TP1;

import org.example.TP1.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exo2Test {

    @Test
    void testNullFirstString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test"));
    }

    @Test
    void testNullSecondString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("test", null));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
        assertFalse(Anagram.isAnagram("abcd", "abc")); // Couvre les deux cas de longueur différente
    }

    @Test
    void testSameStrings() {
        assertTrue(Anagram.isAnagram("hello", "hello"));
        assertTrue(Anagram.isAnagram("a", "a")); // Couvre le cas avec un seul caractère
    }

    @Test
    void testValidAnagramsDifferentOrder() {
        assertTrue(Anagram.isAnagram("triangle", "integral"));
        assertTrue(Anagram.isAnagram("listen", "silent")); // Autre exemple
    }

    @Test
    void testInvalidAnagramsSameLength() {
        assertFalse(Anagram.isAnagram("apple", "palez"));
        assertFalse(Anagram.isAnagram("abc", "def")); // Tous les caractères différents
    }

    @Test
    void testEmptyStrings() {
        assertTrue(Anagram.isAnagram("", ""));
    }

    @Test
    void testValidAnagramsWithSpaces() {
        assertTrue(Anagram.isAnagram("funeral", "real fun"));
        assertTrue(Anagram.isAnagram("dormitory", "dirty room")); // Autre exemple avec espaces
    }

    @Test
    void testValidAnagramsDifferentCase() {
        assertTrue(Anagram.isAnagram("Tea", "Eat"));
        assertTrue(Anagram.isAnagram("RACE", "care")); // Tout en majuscules vs minuscules
    }

    @Test
    void testInvalidAnagramsSameLettersDifferentCounts() {
        assertFalse(Anagram.isAnagram("aab", "abb"));
        assertFalse(Anagram.isAnagram("xxy", "xyy")); // Autre exemple
    }

    @Test
    void testSpecialCharacters() {
        // Teste plusieurs types de caractères spéciaux
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Anagram.isAnagram("hello!", "!olleh"));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Anagram.isAnagram("123", "321"));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Anagram.isAnagram("a-b", "b-a"));
    }

    @Test
    void testStringIndexOutOfBounds() {
        // Couvre explicitement le cas où i == s1.length() dans la boucle
        assertThrows(StringIndexOutOfBoundsException.class, () -> Anagram.isAnagram("a", "a"));
    }

    @Test
    void testAllLetters() {
        // Test complet avec toutes les lettres de l'alphabet
        assertTrue(Anagram.isAnagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba"));
    }

    @Test
    void testNonAnagramWithSameLetters() {
        // Cas où les lettres sont les mêmes mais les comptes diffèrent
        assertFalse(Anagram.isAnagram("aabbcc", "aabbcd"));
    }

    @Test
    void testMultipleSpaces() {
        // Test avec plusieurs espaces
        assertTrue(Anagram.isAnagram("parliament", "partial men"));
    }
    @Test
    void testAllCountsZero() {
        // Cas où tous les counts sont bien à zéro
        assertTrue(Anagram.isAnagram("abc", "cba"));
        assertTrue(Anagram.isAnagram("aabbcc", "ccbbaa"));
    }

    @Test
    void testNonZeroCount() {
        // Cas où au moins un count n'est pas zéro
        assertFalse(Anagram.isAnagram("aab", "abb")); // 'a' et 'b' ont des counts non nuls
        assertFalse(Anagram.isAnagram("xxy", "xyy")); // 'x' et 'y' ont des counts non nuls
    }

    @Test
    void testSingleLetterDifference() {
        // Cas où une seule lettre diffère (mais même longueur)
        assertFalse(Anagram.isAnagram("abcd", "abce")); // Seul 'd' vs 'e' diffère
        assertFalse(Anagram.isAnagram("hello", "hellp")); // Seul 'o' vs 'p' diffère
    }
    @Test
    void testMultipleNonZeroCounts() {
        // Cas où plusieurs counts ne sont pas zéro
        assertFalse(Anagram.isAnagram("aabbcc", "aabbdd")); // 'c' et 'd' ont des counts non nuls
    }

    @Test
    void testAllLettersDifferent() {
        // Cas où toutes les lettres sont différentes
        assertFalse(Anagram.isAnagram("abc", "def")); // Tous les counts seront non nuls
    }
}