package TP1;

import org.example.TP1.entité.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumeralTest {

    @ParameterizedTest
    @CsvSource({
            "1, I", "4, IV", "9, IX", "25, XXV",
            "42, XLII", "90, XC", "125, CXXV",
            "800, DCCC", "900, CM", "1999, MCMXCIX",
            "3999, MMMCMXCIX"
    })
    void testToRoman_ValidInput(int input, String expected) {
        assertEquals(expected, RomanNumeral.toRoman(input));
    }

    @Test
    void testToRoman_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }
}
