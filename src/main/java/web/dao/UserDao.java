package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public void addUser(User user);

    public User getUser(long id);

    public void editUser(User user);

    public void deleteUser(long id);

}