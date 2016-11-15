package com.nj.tampa.mapper;

import com.nj.tampa.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2016/11/15.
 */

@Mapper
@Component
public interface FaulMapper {

    User get(int id);
}
