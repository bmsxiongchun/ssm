package com.xiong.www.service;

import com.xiong.www.po.UserEntity;

import java.util.List;

public interface UserService {
    /*
    * Desc:用户表相关的service窗口
    * */

    List<UserEntity> getAllUsers();
}
