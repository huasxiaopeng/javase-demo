package com.example.javasedemo.java8.optional.action;

import java.util.List;
import java.util.Optional;

/**
 * @Description Dao
 * @Author lktbz
 * @Date 2021/07/29
 */
public interface UserDao {
    User saveOrUpdateUser(User user) throws Exception;
    boolean checkUserExist(String userName);
    Optional<User> loadUserByUsername(String userName);
    void deleteUser(int userId) throws Exception;
    List<User> getUsers() throws Exception;
    Optional<User> getUserById(Integer userId) throws Exception;
}
