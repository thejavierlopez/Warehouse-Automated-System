package com.was;

public interface UserDAO {
    void addUser(User user);

    User getUser(String id);

    void updateUser(User user);
    void deleteUser(String id);
}