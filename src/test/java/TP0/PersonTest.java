package TP0;

import org.example.TP0.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFullNameShouldReturnFirstNameSpaceLastName() {
        // Arrange
        Person person = new Person("John", "Doe", 30);

        // Act
        String fullName = person.getFullName();

        // Assert
        assertEquals("John Doe", fullName);
    }

    @Test
    void isAdultShouldReturnTrueWhenAgeIs18OrMore() {
        // Arrange
        Person adult = new Person("John", "Doe", 18);
        Person minor = new Person("Jane", "Doe", 17);

        // Act & Assert
        assertTrue(adult.isAdult());
        assertFalse(minor.isAdult());
    }
}
