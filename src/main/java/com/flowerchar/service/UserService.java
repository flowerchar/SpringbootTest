package com.flowerchar.service;

import com.flowerchar.entity.User;
import com.flowerchar.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
}
