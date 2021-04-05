package com.boot.mybatis.service.impl;

import com.boot.mybatis.dao.UserDao;
import com.boot.mybatis.entity.User;
import com.boot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.boot.mybatis.service.impl
 * @ClassName: UserServiceImpl
 * @Description: This is UserServiceImpl class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-05 21:17
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public List<Map<String, Object>> list(User user) {
        return dao.list(user);
    }
}
