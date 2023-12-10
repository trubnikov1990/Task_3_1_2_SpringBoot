package Task_3_1_2_SpringBoot.service;


import Task_3_1_2_SpringBoot.model.User;
import java.util.List;

public interface UserService {

  void addUser (User user);

  void deleteUser (int id);

  void updateUser (int id, User user);

   User showUser (int id);

  List<User> listUsers ();

}
