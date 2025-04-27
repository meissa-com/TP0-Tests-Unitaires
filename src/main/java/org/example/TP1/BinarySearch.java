package org.example.TP1;

public class BinarySearch {
    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }
        int low = 0;
        int high = array.length - 1;
        while (low < high) { // <-- Problème ici: devrait être low <= high
            int mid = (low + high) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] <= element) { // <-- Mauvaise condition pour une recherche binaire classique
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

/*
------------------------------------------------
Classe corrigée (correction du while et du <=)
------------------------------------------------

package org.example.TP1;

public class BinarySearch {
    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high) { // <-- corrigé: low <= high
            int mid = (low + high) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) { // <-- corrigé: strictement <
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

*/

