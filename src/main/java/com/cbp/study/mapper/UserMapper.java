package com.cbp.study.mapper;

import com.cbp.study.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @author: cbp
 * @date: 2020/11/21 0021  下午 3:44
 */
@Mapper
public interface UserMapper {

    @Select("select * from user  where mobile = #{mobile}")
    User getUserByMobile(String mobile);

    @Insert("insert into user (user_id,nickName,sex,mobile,email,password) values (#{user_id},#{nickName},#{sex},#{mobile},#{email},#{password})")
    void insert(User user);
}
