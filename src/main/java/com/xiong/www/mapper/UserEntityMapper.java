package com.xiong.www.mapper;

import com.xiong.www.po.UserEntity;

import java.util.List;

public interface UserEntityMapper {

    /**
     * 查找所有用户的信息
     *
     * **/
    List<UserEntity> getAllUsers();
}
