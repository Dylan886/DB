package com.ccsu.db.controller;

import com.ccsu.db.pojo.Usr;
import com.ccsu.db.service.UsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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
    //考虑判断从lcoalStorage的字段传值过来
    @RequestMapping("/login")
    @ResponseBody
    Usr login(HttpServletRequest req){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        return  this.usrService.login(username, password);
    }
    //根据Id查询指定用户
    @RequestMapping("/queryById")
    @ResponseBody
    Usr selectByPrimaryKey(int id) {
        return this.usrService.selectByPrimaryKey(id);
    }

    @RequestMapping("/insert")
    @ResponseBody
    int insert(Usr usr) {
        return this.usrService.insertSelective(usr);
    }

    @RequestMapping("/updateById")
    @ResponseBody
    int updateByPrimaryKey(@RequestBody Usr usr) {
        return this.usrService.updateByPrimaryKey(usr);
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    int deleteByPrimaryKey(Integer id) {
        return this.usrService.deleteByPrimaryKey(id);
    }
}
