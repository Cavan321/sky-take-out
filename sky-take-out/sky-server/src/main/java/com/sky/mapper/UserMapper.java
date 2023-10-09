package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

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

    /**
     * 根据id查询用户
     * @param id:
     * @return User
     */
    @Select("select * from user where id = #{id}")
    User getById(Long id);

    /**
     * 根据动态条件统计用户数量
     * @param map:
     * @return Integer
     */
    Integer countByMap(Map map);
}
