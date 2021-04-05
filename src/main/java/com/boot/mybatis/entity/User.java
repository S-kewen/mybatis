package com.boot.mybatis.entity;

import lombok.Data;

import java.util.Date;

/**
 * @PackageName: com.boot.mybatis.entity
 * @ClassName: User
 * @Description: This is User class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-05 21:12
 */
@Data
public class User {
    private Long id;
    private int type;
    private int state;
    private String username;
    private String password;
    private String remark;
    private Date addTime;
}
