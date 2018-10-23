package com.pjb.springbootjjwt;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.pjb.springbootjjwt.entity.User;
import com.pjb.springbootjjwt.mapper.UserMapper;
import com.pjb.springbootjjwt.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJjwtApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {

        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");

        Gson gson = new Gson();

        System.out.println(gson.toJson(user));
    }

    @Test
    public void test01(){

        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");

        User byUsername = userMapper.findByUsername("张三");

        System.out.println("***********************"+byUsername);
    }


}
