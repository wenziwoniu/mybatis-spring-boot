package com.vivebest.mybatis.spring.boot.service;

import com.vivebest.mybatis.spring.boot.entity.User;

public interface UserService {
    User queryUser(Integer id);
}