package exercice2;

import org.example.exercice2.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void pushShouldAddElementToTopOfStack() {
        // Arrange
        Stack stack = new Stack();

        // Act
        stack.push(5);

        // Assert
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());
        assertEquals(5, stack.peek());
    }

    @Test
    void popShouldRemoveAndReturnTopElement() {
        // Arrange
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);

        // Act
        int popped = stack.pop();

        // Assert
        assertEquals(10, popped);
        assertEquals(1, stack.size());
        assertEquals(5, stack.peek());
    }

    @Test
    void popShouldThrowWhenStackIsEmpty() {
        // Arrange
        Stack stack = new Stack();

        // Act & Assert
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    void stackShouldExpandWhenFull() {
        // Arrange
        Stack stack = new Stack();

        // Act - fill beyond initial capacity
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }

        // Assert
        assertEquals(15, stack.size());
    }
}
