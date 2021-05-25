package com.test.user.service;

import com.test.user.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public String selectOne(String fundCode) {
        return userMapper.selectOne(fundCode);
    }
}
