package exercice4;

import org.example.exercice4.Prime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrimeShouldReturnCorrectResult() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertFalse(Prime.isPrime(4));
        assertTrue(Prime.isPrime(5));
        assertFalse(Prime.isPrime(9));
        assertTrue(Prime.isPrime(17));
    }

    @Test
    void isPrimeShouldHandleNegativeNumbers() {
        assertFalse(Prime.isPrime(-1));
        assertFalse(Prime.isPrime(-5));
    }
}
