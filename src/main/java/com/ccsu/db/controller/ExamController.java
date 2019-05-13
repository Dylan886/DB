package com.ccsu.db.controller;


import com.ccsu.db.pojo.Exam;
import com.ccsu.db.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        List<Exam> examList = this.examService.queryAll();
        for (Exam exam: examList) {
            exam.setAnswer("");
        }
        return examList;
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

    @RequestMapping("/getGrade")
    @ResponseBody
    int getGrade(@RequestBody List<Exam> examList){
        int grade = 0;
        for (Exam exam: examList) {
            Exam realExam = this.examService.selectByPrimaryKey(exam.getId());
            if (realExam.getAnswer().equals(exam.getAnswer())){
                grade += Integer.valueOf(realExam.getGrade());
            }
        }
        return grade;
    }
}
