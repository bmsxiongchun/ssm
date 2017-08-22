package com.xiong.www.service.impl;

import com.xiong.www.mapper.UserEntityMapper;
import com.xiong.www.po.UserEntity;
import com.xiong.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UerServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper mapper;

    @Override
    public List<UserEntity> getAllUsers() {
        return mapper.getAllUsers();
    }
}
