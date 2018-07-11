package com.vivebest.mybatis.spring.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivebest.mybatis.spring.boot.dao.UserDao;
import com.vivebest.mybatis.spring.boot.entity.User;
import com.vivebest.mybatis.spring.boot.service.UserService;

@Service("com.vivebest.mybatis.spring.boot.service.UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    
    @Override
    public User queryUser(Integer id) {
        return userDao.findOne(id);
    }
}