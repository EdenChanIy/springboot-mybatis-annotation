package com.edenchaniy.springboot_demo.dao;

import com.edenchaniy.springboot_demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "username"),
            @Result(property = "password", column = "password")
    })
    List<User> findList();

    @Select("SELECT * FROM user WHERE id=#{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "username"),
            @Result(property = "password", column = "password")
    })
    User findListById(int id);

    @Insert("INSERT INTO user(username, password) VALUES(#{name}, #{password})")
    void add(User user);

    @Update("UPDATE user SET username=#{name}, password=#{password} WHERE id=#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id=#{id}")
    void delete(int id);
}
