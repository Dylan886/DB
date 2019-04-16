package com.ccsu.db.controller;


import com.ccsu.db.pojo.Exam;
import com.ccsu.db.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Exam")
public class ExamController {
    //依赖注入
    @Autowired
    private ExamService examService;

    //根据Id查询指定用户
    @RequestMapping("/queryById")
    @ResponseBody
    Exam selectByPrimaryKey(int id) {
        return this.examService.selectByPrimaryKey(id);
    }

    @RequestMapping("/getAllExam")
    @ResponseBody
    public List<Exam> queryAll() {
        return this.examService.queryAll();
    }

    @RequestMapping("/insert")
    @ResponseBody
    int insert(Exam Exam) {
        return this.examService.insert(Exam);
    }

    @RequestMapping("/updateById")
    @ResponseBody
    int updateByPrimaryKey(Exam Exam) {
        return this.examService.updateByPrimaryKey(Exam);
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    int deleteByPrimaryKey(int id) {
        return this.examService.deleteByPrimaryKey(id);
    }
}
