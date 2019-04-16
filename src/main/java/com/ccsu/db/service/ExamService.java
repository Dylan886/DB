package com.ccsu.db.service;

import com.ccsu.db.dao.ExamMapper;
import com.ccsu.db.pojo.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {
    @Autowired
    private ExamMapper examMapper;
    //通过id查询
    public Exam selectByPrimaryKey(int id) {
        return this.examMapper.selectByPrimaryKey(id);
    }
    //通过id修改
    public int updateByPrimaryKey(Exam exam) {
        return this.examMapper.updateByPrimaryKeySelective(exam);
    }
    //增加一条记录
    public int insert(Exam exam) {
        return this.examMapper.insert(exam);
    }

    public List<Exam> queryAll() {
        return null;
    }
    //通过id删除
    public int deleteByPrimaryKey(int id) {
        return this.examMapper.deleteByPrimaryKey(id);
    }
}
