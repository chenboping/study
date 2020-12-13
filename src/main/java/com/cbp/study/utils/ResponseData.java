package com.cbp.study.utils;

import lombok.Data;

/**
 * @ClassName: ResponseData
 * @Description: TODO
 * @author: cbp
 * @date: 2020/11/22 0022  下午 8:21
 */
@Data
public class ResponseData {

    private int code;

    private String message;

    private Object data;

    public ResponseData(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
