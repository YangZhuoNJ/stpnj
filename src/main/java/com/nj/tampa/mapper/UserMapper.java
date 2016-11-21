package com.nj.tampa.mapper;

import com.nj.tampa.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * Created by admin on 2016/11/14.
 */
@Mapper
public interface UserMapper {

    User findUserById(Integer id);

    User findUserByName(String name);

    void save(@Param("name") String name, @Param("age") Integer age, @Param("email") String email);

    void delete(String id);
}