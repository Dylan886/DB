package com.ccsu.db.dao;

import com.ccsu.db.pojo.Usr;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsrMapper {
    @Select("SELECT *  FROM user WHERE id = #{id}")
    Usr queryById(int id);

    List<Usr> queryAll();

    int add(Usr user);

    int delById(int id);

    int updateById(Usr user);

    @Select(" select * from user where username=#{username} and password=#{password}")
    Usr login(@Param("loginname") String username, @Param("password") String password);
}
