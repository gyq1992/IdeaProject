package com.example.gyq.mapper;

import com.example.gyq.pojo.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserMapper {
    //添加用户
    public void addUser(Users users);
    //查询全部用户
    public List<Users> ulist();
    //删除用户
    public void deleteUsers(int uid);
}
