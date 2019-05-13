package com.ccsu.db.controller;

import com.ccsu.db.pojo.TestPaper;
import com.ccsu.db.service.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/TestPaper")
public class TestPaperController {
    //依赖注入
    @Autowired
    private TestPaperService testPaperService;

    //根据Id查询指定用户
    @RequestMapping("/queryById")
    @ResponseBody
    TestPaper selectByPrimaryKey(int id) {
        return this.testPaperService.selectByPrimaryKey(id);
    }

    @RequestMapping("/getAllTestPaper")
    @ResponseBody
    public List<TestPaper> queryAll() {
        return this.testPaperService.queryAll();
    }

    @RequestMapping("/insert")
    @ResponseBody
    int insert(TestPaper TestPaper) {
        return this.testPaperService.insert(TestPaper);
    }

    @RequestMapping("/updateById")
    @ResponseBody
    int updateByPrimaryKey(TestPaper TestPaper) {
        return this.testPaperService.updateByPrimaryKey(TestPaper);
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    int deleteByPrimaryKey(int id) {
        return this.testPaperService.deleteByPrimaryKey(id);
    }
}
