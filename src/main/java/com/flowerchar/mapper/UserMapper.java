package com.flowerchar.mapper;


import com.flowerchar.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(int id);
}
