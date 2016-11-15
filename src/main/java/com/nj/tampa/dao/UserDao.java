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

    @Autowired
    private UserMapper userMapper;

    public User findUserById(Integer id) throws Exception {
        return userMapper.findUserById(id);
    }

//    public void save() throws Exception {
//        userMapper.save("yangzhuo", 21,"hityangzhuo@sian.cn");
//    }
}
