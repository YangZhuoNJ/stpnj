package com.nj.tampa.mapper;

import com.nj.tampa.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


/**
 * Created by admin on 2016/11/14.
 */
@Mapper
@Component
public interface UserMapper {

    User findUserById(Integer id);

    void save(User user);

    void delete(String id);
}