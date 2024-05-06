package com.was;

public interface UserDAO {
    void addUser(User user);

    User getUser(String id);

    void updateUser(User user);
    boolean deleteUser(String id);
    void deleteAllRegularUsers();


}