package com.example.gyq.service.impl;


import com.example.gyq.mapper.IUserMapper;
import com.example.gyq.pojo.Users;
import com.example.gyq.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersService implements IUsersService {
    @Autowired
    private IUserMapper userMapper;
    @Override
    public void addUser(Users users) {
        userMapper.addUser(users);
    }

    @Override
    public List<Users> ulist() {
        return userMapper.ulist();
    }
}
