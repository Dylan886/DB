package com.ccsu.db.dao;

import com.ccsu.db.pojo.Exam;
import com.ccsu.db.pojo.TestPaper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestPaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestPaper testPaper);

    int insertSelective(TestPaper testPaper);

    TestPaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestPaper testPaper);

    int updateByPrimaryKey(TestPaper testPaper);

    @Select("select * from testPaper")
    List<TestPaper> queryAll();
}
