package tp3.exo1;

import org.example.tp3.exo1.User;

public interface UserRepository {
    User findUserById(long id);
}
