package com.ccsu.db.dao;

import com.ccsu.db.pojo.Usr;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Usr record);

    int insertSelective(Usr record);

    Usr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usr record);

    int updateByPrimaryKey(Usr record);

    @Select("select * from usr")
    List<Usr> getAllUser();

    @Select(" select * from usr where username=#{username} and password=#{password}")
    Usr login(@Param("loginname") String username, @Param("password") String password);
}