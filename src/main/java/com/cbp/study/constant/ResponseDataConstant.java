package com.cbp.study.constant;

import com.cbp.study.utils.ResponseData;

/**
 * @ClassName: ResponseDataConstant
 * @Description: TODO
 * @author: cbp
 * @date: 2020/11/22 0022  下午 8:24
 */
public class ResponseDataConstant {

    public static ResponseData SUCCESS = new ResponseData(0, "success", null);

    public static ResponseData PARAM_ERROR = new ResponseData(100001, "参数错误", null);

    public static ResponseData USER_NAME_PASSWORD = new ResponseData(100001, "用户名或密码错误", null);

    public static ResponseData USER_IS_EXIT = new ResponseData(100001, "用户已存在", null);


}
