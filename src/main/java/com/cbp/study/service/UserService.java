package com.cbp.study.service;

import com.cbp.study.utils.ResponseData;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author: cbp
 * @date: 2020/11/22 0022  下午 8:53
 */
public interface UserService {

    ResponseData register(String mobile,String password);

    ResponseData login(String mobile,String password);

}
