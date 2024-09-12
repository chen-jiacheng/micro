package com.chenjiacheng.micro.web.controller;

import com.chenjiacheng.micro.api.model.Result;
import com.chenjiacheng.micro.dao.mapper.UserMapper;
import com.chenjiacheng.micro.dao.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chenjiacheng on 2024/9/13 00:47
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.GET,path = "/all")
    @ResponseBody
    public Object findAll(){
        List<User> users = userMapper.getAll();
        return Result.ok(users);
    }


}
