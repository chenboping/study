package com.cbp.study.controller;

import com.cbp.study.constant.ResponseDataConstant;
import com.cbp.study.service.UserService;
import com.cbp.study.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author: cbp
 * @date: 2020/11/22 0022  下午 8:30
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public ResponseData register(@RequestParam(value = "mobile",required = true) String mobile,@RequestParam(value = "password",required = false) String password) {

        if (StringUtils.isEmpty(mobile) || StringUtils.isEmpty(password)) {
            return ResponseDataConstant.PARAM_ERROR;
        }
        ResponseData register = userService.register(mobile, password);
        return register;
    }

    @GetMapping("/login")
    public ResponseData login(@RequestParam(value = "mobile",required = true) String mobile,@RequestParam(value = "password",required = true) String password){
        if (StringUtils.isEmpty(mobile) || StringUtils.isEmpty(password)) {
            return ResponseDataConstant.PARAM_ERROR;
        }
        ResponseData login = userService.login(mobile, password);
        return login;
    }
}
