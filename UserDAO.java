public interface UserDAO {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(String id);
}