package tp3.exo1;

import org.example.tp3.exo1.User;
import org.example.tp3.exo1.UserRepository;
import org.example.tp3.exo1.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testGetUserById() {
        // Créer un mock de UserRepository
        UserRepository userRepositoryMock = mock(UserRepository.class);

        // Créer un User fictif à retourner
        org.example.tp3.exo1.User fakeUser = new org.example.tp3.exo1.User(1L, "John Doe");

        // Définir le comportement du mock
        when(userRepositoryMock.findUserById(1L)).thenReturn(fakeUser);

        // Créer le UserService avec le mock
        UserService userService = new UserService(userRepositoryMock);

        // Appeler la méthode à tester
        User result = userService.getUserById(1L);

        // Vérifier que le résultat est correct
        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals("John Doe", result.getName());

        // Vérifier que la méthode findUserById du mock a été appelée avec l'ID correct
        verify(userRepositoryMock).findUserById(1L);
    }
}
