package TP1;

import org.example.TP1.entité.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void testSolve_TwoRealRoots() {
        double[] roots = QuadraticEquation.solve(1, -3, 2);
        assertArrayEquals(new double[]{2.0, 1.0}, roots, 0.0001);
    }

    @Test
    void testSolve_OneRealRoot() {
        double[] roots = QuadraticEquation.solve(1, -4, 4);
        assertArrayEquals(new double[]{2.0}, roots, 0.0001);
    }

    @Test
    void testSolve_NoRealRoots() {
        assertNull(QuadraticEquation.solve(1, 2, 5));
    }

    @Test
    void testSolve_ZeroA() {
        assertThrows(IllegalArgumentException.class, () ->
                QuadraticEquation.solve(0, 2, 5));
    }
}
