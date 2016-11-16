package com.nj.tampa.dao;

import com.nj.tampa.domain.User;
import com.nj.tampa.mapper.UserMapper;
import com.sun.corba.se.spi.ior.IdentifiableFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2016/11/14.
 */

//@Component
public class UserDao {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(Integer id) throws Exception {
        return userMapper.findUserById(id);
    }

    public void save(User user) throws Exception {
        userMapper.save(user);
    }

    public void delete(String id) throws Exception {
        userMapper.delete(id);
    }
}
