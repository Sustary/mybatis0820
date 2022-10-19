package com.sxy.mapper;

import com.sxy.pojo.User;
import org.apache.ibatis.annotations.Param;
import sun.reflect.generics.tree.VoidDescriptor;

import java.util.List;

/**
 * @description: UserMapper
 * @author: suxingyu
 * @create: 2022-08-20 17:38
 **/
public interface UserMapper {

    List<User> selectAll();

    User selectById(@Param("id") Integer id);

    List<User> selectByUser(@Param("user") User user);

    //使用 <trim> 标签的 sql 语句
    List<User> selectByCondition(@Param("username") String username, @Param("address") String address);

    //使用 <where> 标签的 sql 语句
    List<User> selectByCondition1(@Param("username") String username, @Param("address") String address);

    void insertUser(@Param("user") User user);

    void deleteById(@Param("id") Integer id);

    //使用 <trim> 标签的 sql 语句
    // 10.19-为什么会执行失败？报错”找不到参数“？
    void updateUser(User user);

    //使用 <set> 标签的 sql 语句
    // 10.19-为什么会执行失败？报错”找不到参数“？
    void updateUser1(@Param("user") User user);

    //练习 <foreach> 标签
    List<User> selectByIds(@Param("ids") Integer[] ids);

    //使用 <where-choose-when> 标签的 sql
    //这里如果参数加上 @Param 注解，执行 sql 会报错，不知道是什么原因
    List<User> selectChoose(User user);
}