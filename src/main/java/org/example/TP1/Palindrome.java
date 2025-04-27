package org.example.TP1;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new NullPointerException("String must not be null");
        }
        s = s.toLowerCase().replaceAll("\\s+", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j++; // <-- BUG : ici il faut faire j-- ;
            i--; // <-- BUG : ici il faut faire i++ ;
        }
        return true;
    }
}
git add .

/*
---------------------------------------------------
Classe corrigée (correction des erreurs sur i et j)
---------------------------------------------------

package org.example.TP1;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new NullPointerException("String must not be null");
        }
        s = s.toLowerCase().replaceAll("\\s+", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++; // <-- corrigé : avancer i
            j--; // <-- corrigé : reculer j
        }
        return true;
    }
}

*/

