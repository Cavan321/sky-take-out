package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Cavan
 * @date 2023-09-29
 * @qq 2069543852
 */
@Mapper
public interface UserMapper {
    /**
     * 根据openid查询用户
     * @param openid:
     * @return User
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 插入数据
     * @param user:  
     * @return void
     */
    void insert(User user);
}
