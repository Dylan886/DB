package com.ccsu.db.controller;

import com.ccsu.db.pojo.Resource;
import com.ccsu.db.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Resource")
public class ResourceController {
    //依赖注入
    @Autowired
    private ResourceService resourceService;

    //根据Id查询指定用户
    @RequestMapping("/queryById")
    @ResponseBody
    Resource selectByPrimaryKey(int id) {
        return this.resourceService.selectByPrimaryKey(id);
    }

    @RequestMapping("/getAllResource")
    @ResponseBody
    public List<Resource> queryAll() {
        return this.resourceService.queryAll();
    }

    @RequestMapping("/insert")
    @ResponseBody
    int insert(Resource Resource) {
        return this.resourceService.insert(Resource);
    }

    @RequestMapping("/updateById")
    @ResponseBody
    int updateByPrimaryKey(Resource Resource) {
        return this.resourceService.updateByPrimaryKey(Resource);
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    int deleteByPrimaryKey(int id) {
        return this.resourceService.deleteByPrimaryKey(id);
    }
}
