package com.ccsu.db.controller;

import com.ccsu.db.pojo.Jurisdiction;
import com.ccsu.db.service.JurisdictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Jurisdiction")
public class JurisdictionController {
    //依赖注入
    @Autowired
    private JurisdictionService jurisdictionService;

    //根据Id查询指定用户
    @RequestMapping("/queryById")
    @ResponseBody
    Jurisdiction selectByPrimaryKey(int id) {
        return this.jurisdictionService.selectByPrimaryKey(id);
    }

    @RequestMapping("/insert")
    @ResponseBody
    int insert(Jurisdiction jurisdiction) {
        return this.jurisdictionService.insert(jurisdiction);
    }

    @RequestMapping("/updateById")
    @ResponseBody
    int updateByPrimaryKey(Jurisdiction jurisdiction) {
        return this.jurisdictionService.updateByPrimaryKey(jurisdiction);
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    int deleteByPrimaryKey(int id) {
        return this.jurisdictionService.deleteByPrimaryKey(id);
    }

    @RequestMapping("/getJurisdictionById")
    @ResponseBody
    Jurisdiction getJurisdictionById(int id){ return this.jurisdictionService.getJurisdictionById(id);}

    @RequestMapping("/getJurisdictionByUId")
    @ResponseBody
    Jurisdiction getJurisdictionByUId(int uid){ return this.jurisdictionService.getJurisdictionByUId(uid);}

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Jurisdiction> getAllUsr() {
        return this.jurisdictionService.queryAll();
    }
}

