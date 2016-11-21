package com.nj.tampa.controller;

import com.nj.tampa.dao.UserDao;
import com.nj.tampa.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2016/11/14.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/fu")
    public User findUserById() {
        User user = null;
        try {
            user = userDao.findUserById(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @RequestMapping("/name")
    public User findByName() throws Exception{
        return userDao.findByName("sdf");
    }
    
    @RequestMapping("/sv")
    public void save() throws Exception {
        User user = new User( "454","Yangzhuo", 23, "yamakedidfks@hit.com");
        userDao.save(user);

    }
}
