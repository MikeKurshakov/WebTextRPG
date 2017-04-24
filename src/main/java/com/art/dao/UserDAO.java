package com.art.dao;
import com.art.model.User;
import java.util.List;

public interface UserDAO {
    public List<User> getAll();
    public User findById(int id );
    public void addUser(User user);
    public void deleteUser(int id);
    public User findByLogin(String login);
    public User findByEmail(String email);
    public void update(User user);
    public int count();
}
