package com.boot.mybatis.service;

import com.boot.mybatis.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.boot.mybatis.service
 * @ClassName: UserService
 * @Description: This is UserService interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-05 21:16
 */
public interface UserService {
    List<Map<String, Object>> list(User user);
}
