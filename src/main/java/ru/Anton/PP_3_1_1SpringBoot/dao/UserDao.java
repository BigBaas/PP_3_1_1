package ru.Anton.PP_3_1_1SpringBoot.dao;

import ru.Anton.PP_3_1_1SpringBoot.models.User;
import java.util.List;

public interface UserDao {

    List<User> index ();

    User showUser (int id);

    void save (User user);

    void update (User userUpdated);

    void deleteUser (int id);
}