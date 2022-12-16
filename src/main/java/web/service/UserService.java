package web.service;

import web.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getAllUsers();

    public void addUser(User user);

    public User getUser(long id);

    public void editUser(User user);

    public void deleteUser(long id);
}