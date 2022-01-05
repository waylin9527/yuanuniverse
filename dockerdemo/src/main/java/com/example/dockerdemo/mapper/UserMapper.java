package com.example.dockerdemo.mapper;

import com.example.dockerdemo.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name, String password);

}
