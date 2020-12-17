package com.dao;

import com.pojo.Users;
import com.utils.RetDataMsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface UserDaoMapper {
    //登录验证
    public Users vfUser(@Param("userNumber") Integer userNumber, @Param("userPwd") String userPwd);

}
