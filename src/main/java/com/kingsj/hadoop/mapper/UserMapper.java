package com.kingsj.hadoop.mapper;

import org.apache.ibatis.annotations.Param;

import com.kingsj.hadoop.model.User;

public interface UserMapper extends SqlMapper,BaseMapper<User, String>{
   
    public User selectByUser(@Param("username") String username,@Param("password") String pwd);
    
    public User selectByUserName(@Param("username") String username);
}