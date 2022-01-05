
package com.example.dockerdemo.serviceImpl;

import com.example.dockerdemo.bean.UserBean;
import com.example.dockerdemo.mapper.UserMapper;
import com.example.dockerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
