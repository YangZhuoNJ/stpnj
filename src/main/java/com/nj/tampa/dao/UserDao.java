package com.nj.tampa.dao;

import com.nj.tampa.domain.User;
import com.nj.tampa.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2016/11/14.
 */

@Component
public class UserDao {

    @Autowired(required = false)
    private UserMapper userMapper;

    public User findUserById(Integer id) throws Exception {
        return userMapper.findUserById(id);
    }

    public User findByName(String name) throws Exception {
        return userMapper.findUserByName(name);
    }


    public void save(User user) throws Exception {
        userMapper.save(user);
    }

    public void delete(String id) throws Exception {
        userMapper.delete(id);
    }
}
