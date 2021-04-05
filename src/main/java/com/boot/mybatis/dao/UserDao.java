package com.boot.mybatis.dao;

import com.boot.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.boot.mybatis.dao
 * @ClassName: UserDao
 * @Description: This is UserDao interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-05 21:15
 */
@Mapper
public interface UserDao {
    List<Map<String, Object>> list(User user);
}
