package com.edenchaniy.springboot_demo;

import com.edenchaniy.springboot_demo.dao.UserMapper;
import com.edenchaniy.springboot_demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping
    public List<User> hello(){
        List<User> result = userMapper.findList();
        return result;
//        return "Hello Spring Boot!^_^";
    }

}
