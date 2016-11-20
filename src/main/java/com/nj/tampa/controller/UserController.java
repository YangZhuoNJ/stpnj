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



//    @RequestMapping("/sv")
//    public void save() {
//        try {
//            userDao.save();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return;
//    }
}