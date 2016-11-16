package com.nj.tampa.mapper;

import com.nj.tampa.domain.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * Created by admin on 2016/11/14.
 */
@Mapper
public interface UserMapper {

    User findUserById(Integer id);

//    void save(String name, Integer age, String email);
}