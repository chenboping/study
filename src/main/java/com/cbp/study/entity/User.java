package com.cbp.study.entity;

import lombok.Data;

/**
 * @ClassName: User
 * @Description: TODO
 * @author: cbp
 * @date: 2020/11/21 0021  下午 3:24
 */
@Data
public class User {

    /**
     * create table user(
     * id bigint(20) not null PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
     * users_id varchar(20) not null default '-1' COMMENT '用户id',
     * sex int not null default 0 COMMENT '性别',
     * mobile varchar(30) not null default '-1' COMMENT '手机号',
     * email varchar(36) default '-1' COMMENT '邮箱',
     * password varchar(36) not null COMMENT '密码'
     * )COMMENT '用户表';
     */

    private int id;

    private String user_id;

    private String nickName;

    private int sex;

    private String mobile;

    private String email;

    private String password;

}
