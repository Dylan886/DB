package com.ccsu.db.dao;

import com.ccsu.db.pojo.Jurisdiction;

public interface jurisdictionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jurisdiction record);

    int insertSelective(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jurisdiction record);

    int updateByPrimaryKey(Jurisdiction record);
}