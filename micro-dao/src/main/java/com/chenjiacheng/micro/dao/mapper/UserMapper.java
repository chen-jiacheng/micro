package com.chenjiacheng.micro.dao.mapper;


import com.chenjiacheng.micro.dao.model.User;

import java.util.List;

/**
 * Created by chenjiacheng on 2024/4/21 04:13
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public interface UserMapper {

    /***
     * 添加用户信息
     * @param user 用户信息
     */
    void insertUser(User user);

    /***
     * 查询用户信息
     * @param id 用户Id
     * @return 用户信息
     */
    User getUser(Integer id);

    /**
     * 查询所有用户
     * @return
     */
    List<User> getAll();

}
