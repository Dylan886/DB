package com.ccsu.db.dao;

import com.ccsu.db.pojo.Exam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExamMapper {
    Exam queryById(int id);

    List<Exam> queryAll();

    int add(Exam exam);

    int delById(int id);

    int updateById(Exam exam);
}
