package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUserById(Long id);

    @Transactional
    void updateUser(Long id, User updatedUser);

    void deleteUser(Long id);
}
