package pl.siwiec.admin;

import pl.siwiec.users.User;

public interface UserService {

    User findByUserName(String name);
    void saveUser(User user);
}
