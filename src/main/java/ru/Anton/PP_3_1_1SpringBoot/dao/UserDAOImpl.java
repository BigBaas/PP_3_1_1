package ru.Anton.PP_3_1_1SpringBoot.dao;

import org.springframework.stereotype.Repository;
import ru.Anton.PP_3_1_1SpringBoot.models.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;



@Repository
public class UserDAOImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> index() {
        return entityManager.createQuery(
                "select user from User user", User.class)
                .getResultList();
    }
    @Override
    public User showUser(int id) {
        User user = entityManager.find(User.class, id);
        return user;
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User userUpdated) {
        entityManager.merge(userUpdated);
    }

    @Override
    public void deleteUser(int id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

}
