package com.edenchaniy.springboot_demo.controller;

import com.edenchaniy.springboot_demo.dao.UserMapper;
import com.edenchaniy.springboot_demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user/findList")
    public List<User> findList(){
        return userMapper.findList();
    }

    @RequestMapping("user/findListById")
    public User findListById(int id){
        return userMapper.findListById(id);
    }

    @RequestMapping("user/add")
    public void add(User user){
        userMapper.add(user);
    }

    @RequestMapping("user/update")
    public void update(User user){
        userMapper.update(user);
    }

    @RequestMapping("user/delete")
    public String delete(int id){
        userMapper.delete(id);
        return "delete successfully!";
    }
}
