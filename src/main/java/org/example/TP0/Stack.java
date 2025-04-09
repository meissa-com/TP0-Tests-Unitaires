package org.example.TP0;

public class Stack {
    private int[] array;
    private int top;
    private static final int INITIAL_CAPACITY = 10;

    public Stack() {
        array = new int[INITIAL_CAPACITY];
        top = -1; // Indique que la pile est vide
    }

    /**
     * Ajoute un élément au sommet de la pile
     * @param element L'élément à ajouter
     */
    public void push(int element) {
        if (top == array.length - 1) {
            expandArray();
        }
        array[++top] = element;
    }

    /**
     * Retire et retourne l'élément au sommet de la pile
     * @return L'élément retiré
     * @throws IllegalStateException si la pile est vide
     */
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--];
    }

    /**
     * Retourne l'élément au sommet de la pile sans le retirer
     * @return L'élément au sommet
     * @throws IllegalStateException si la pile est vide
     */
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];
    }

    /**
     * Vérifie si la pile est vide
     * @return true si la pile est vide, false sinon
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Retourne le nombre d'éléments dans la pile
     * @return La taille de la pile
     */
    public int size() {
        return top + 1;
    }

    /**
     * Augmente la capacité du tableau interne
     */
    private void expandArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
