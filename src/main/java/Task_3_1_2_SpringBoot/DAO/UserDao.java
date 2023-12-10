package Task_3_1_2_SpringBoot.DAO;

import Task_3_1_2_SpringBoot.model.User;
import java.util.List;


public interface UserDao {

  void add(User user);

  User getUserById (int id);

  void delete (int id);

  void update (int id, User user);

  List<User> getAllUsers();

}
