package com.example.javasedemo.java8.optional.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/29
 */
public class UserDaoImpl  implements UserDao{
    /**
     *  模拟从数据库取数据
     */
    private  static Map<String,User> mysql=new HashMap<>();
    @Override
    public User saveOrUpdateUser(User user) throws Exception {
       User user1=new User();
       user1.setUserId(user.getUserId());
       user1.setFirstName(user.getFirstName());
       user1.setEmail(user.getEmail());
       mysql.put(user1.getUserName(),user1);
        return user1;
    }

    @Override
    public boolean checkUserExist(String userName) {
        return false;
    }

    @Override
    public Optional<User> loadUserByUsername(String userName) {
        User user = mysql.get(userName);
        /**
         * 存在的话返回对象，不存在返回null ，调用 端只需要 get  就可以
         */
        return Optional.ofNullable(user);
    }

    @Override
    public void deleteUser(int userId) throws Exception {

    }

    @Override
    public List<User> getUsers() throws Exception {
        return null;
    }

    @Override
    public Optional<User> getUserById(Integer userId) throws Exception {
        User user = mysql.get(userId);
        return Optional.ofNullable(user);
    }
}
