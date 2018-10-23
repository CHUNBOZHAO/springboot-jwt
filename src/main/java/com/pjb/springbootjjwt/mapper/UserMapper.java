package com.pjb.springbootjjwt.mapper;

import com.pjb.springbootjjwt.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author jinbin
 * @date 2018-07-08 20:44
 */
@Repository
public interface UserMapper {
    User findByUsername(@Param("username") String username);
    User findUserById(@Param("Id") String Id);
}
