package com.ccsu.db.service;

import com.ccsu.db.dao.TestPaperMapper;
import com.ccsu.db.pojo.TestPaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestPaperService {
    @Autowired
    private TestPaperMapper testPaperMapper;
    //通过id查询
    public TestPaper selectByPrimaryKey(int id) {
        return this.testPaperMapper.selectByPrimaryKey(id);
    }
    //通过id修改
    public int updateByPrimaryKey(TestPaper testPaper) {
        return this.testPaperMapper.updateByPrimaryKeySelective(testPaper);
    }
    //增加一条记录
    public int insert(TestPaper testPaper) {
        return this.testPaperMapper.insertSelective(testPaper);
    }

    public List<TestPaper> queryAll() {
        return testPaperMapper.queryAll();
    }
    //通过id删除
    public int deleteByPrimaryKey(int id) {
        return this.testPaperMapper.deleteByPrimaryKey(id);
    }
}
