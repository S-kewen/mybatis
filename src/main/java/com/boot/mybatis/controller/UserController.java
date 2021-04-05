package com.boot.mybatis.controller;

import com.boot.mybatis.entity.User;
import com.boot.mybatis.result.MyResult;
import com.boot.mybatis.result.StatusCode;
import com.boot.mybatis.result.StatusMsg;
import com.boot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName: com.boot.mybatis.controller
 * @ClassName: UserController
 * @Description: This is UserController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-05 21:20
 */
@RestController
@RequestMapping("/v1/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public MyResult list() {
        return new MyResult(StatusCode.OK, StatusMsg.OK,userService.list(new User()));
    }
}
