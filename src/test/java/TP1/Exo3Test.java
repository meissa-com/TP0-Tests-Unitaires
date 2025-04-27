package TP1;
import org.example.TP1.BinarySearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo3Test {
    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 5));
    }

    @Test
    void testEmptyArray() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{}, 5));
    }

    @Test
    void testElementFoundFirstHalf() {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(1, BinarySearch.binarySearch(array, 3));
    }

    @Test
    void testElementFoundSecondHalf() {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(5, BinarySearch.binarySearch(array, 11));
    }

    @Test
    void testElementFoundMiddle() {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(3, BinarySearch.binarySearch(array, 7));
    }

    @Test
    void testElementNotFoundBelowRange() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(array, 0));
    }

    @Test
    void testElementNotFoundAboveRange() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(array, 10));
    }
    @Test
    void testElementFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }

    @Test
    void testElementNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(array, 4));
    }
    @Test
    void testSingleElementFound() {
        int[] array = {5};
        assertEquals(0, BinarySearch.binarySearch(array, 5));
    }

    @Test
    void testSingleElementNotFound() {
        int[] array = {5};
        assertEquals(-1, BinarySearch.binarySearch(array, 3));
    }

    @Test
    void testElementAtBeginning() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(0, BinarySearch.binarySearch(array, 1));
    }

    @Test
    void testElementAtEnd() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(4, BinarySearch.binarySearch(array, 9));
    }
}