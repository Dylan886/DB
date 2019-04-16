package com.ccsu.db.controller;

import com.ccsu.db.pojo.Usr;
import com.ccsu.db.service.UsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Usr")
public class UsrController {
    //依赖注入
    @Autowired
    private UsrService usrService;

    @RequestMapping("/getAllUsr")
    @ResponseBody
    public List<Usr> getAllUsr() {
        return this.usrService.getAllUsr();
    }
    //进行登录操作
    //考虑判断从vue的lcoalStorage的字段传值过来
    @RequestMapping("/login")
    @ResponseBody
    Usr login(String username,String password){
        return  this.usrService.login(username, password);
    }
    //根据Id查询指定用户
    @RequestMapping("/queryById")
    @ResponseBody
    Usr selectByPrimaryKey(int id) {
        return this.usrService.selectByPrimaryKey(id);
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    List<Usr> queryAll() {
        return null;
    }

    @RequestMapping("/insert")
    @ResponseBody
    int insert(Usr Usr) {
        return this.usrService.insert(Usr);
    }

    @RequestMapping("/updateById")
    @ResponseBody
    int updateByPrimaryKey(Usr Usr) {
        return this.usrService.updateByPrimaryKey(Usr);
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    int deleteByPrimaryKey(int id) {
        return this.usrService.deleteByPrimaryKey(id);
    }
}
