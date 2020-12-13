package com.cbp.study.service.impl;

import com.cbp.study.constant.ResponseDataConstant;
import com.cbp.study.constant.ServiceConstant;
import com.cbp.study.entity.User;
import com.cbp.study.mapper.UserMapper;
import com.cbp.study.service.UserService;
import com.cbp.study.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.UUID;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author: cbp
 * @date: 2020/11/22 0022  下午 8:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseData register(String mobile, String password) {

        // 手机号尾数校验 密码加密 对称 非对成加密 散列
        // 从数据库 根据手机
        User userByMobile = userMapper.getUserByMobile(mobile);
        if (!ObjectUtils.isEmpty(userByMobile)) {
            return ResponseDataConstant.USER_IS_EXIT;
        }

        // 像数据库中插入一条数据
        User user = new User();
        user.setMobile(mobile);
        user.setPassword(password);
        user.setUser_id(UUID.randomUUID().toString().substring(20));
        user.setNickName(ServiceConstant.DEFAULT_NICK_NAME);
        user.setSex(ServiceConstant.DEFAULT_SEX);
        user.setEmail("");
        userMapper.insert(user);

        return ResponseDataConstant.SUCCESS;
    }

    @Override
    public ResponseData login(String mobile, String password) {
        User userByMobile = userMapper.getUserByMobile(mobile);
        if (ObjectUtils.isEmpty(userByMobile) || !userByMobile.getPassword().equals(password)) {
            return ResponseDataConstant.USER_NAME_PASSWORD;
        }

        return ResponseDataConstant.SUCCESS;
    }
}
