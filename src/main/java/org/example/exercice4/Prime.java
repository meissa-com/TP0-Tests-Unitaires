package org.example.exercice4;

public class Prime {

    /**
     * Vérifie si un nombre est premier
     * @param n Le nombre à tester
     * @return true si le nombre est premier, false sinon
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        // Teste les diviseurs impairs jusqu'à la racine carrée de n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}