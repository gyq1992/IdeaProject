package com.example.gyq.service;

import com.example.gyq.pojo.Users;

import java.util.List;

public interface IUsersService {
    //添加用户
    public void addUser(Users users);
    //查询全部用户
    public List<Users> ulist();
}
