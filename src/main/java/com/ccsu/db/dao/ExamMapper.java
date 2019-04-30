package com.ccsu.db.dao;

import com.ccsu.db.pojo.Exam;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Exam record);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);
}
