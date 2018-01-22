package hello.dao;

import hello.model.Login;
import hello.model.User;

public interface UserDao {

	  void register(User user);
	  User validateUser(Login login);

}
