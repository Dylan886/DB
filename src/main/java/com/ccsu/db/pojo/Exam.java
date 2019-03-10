package com.ccsu.db.pojo;

//试题
public class Exam {
    private Integer id; // id
    private String type; // 题目类型
    private  String grade; // 分数
    private String question; // 问题
    private String answer; // 答案
    private String A; // 选项A
    private String B;// 选项B
    private String C;// 选项C

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "type = " + type +
                "question = " + question +
                "answer = " + answer +
                "}";
    }
}
