package com.was;

import java.util.List;

public class UserService {
    private final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void addUser(User user) {
        //String hashedPassword = hashPassword(user.getPassword());
        //user.setPassword(hashedPassword); // Set the hashed password
        userDAO.addUser(user);
    }
    /*
    private String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }

     */


    public void deleteUser(User user) {
        userDAO.deleteUser(String.valueOf(user));
    }
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    public void deleteAllRegularUsers() {
        userDAO.deleteAllRegularUsers();
    }


}
