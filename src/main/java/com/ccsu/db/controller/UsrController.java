package com.ccsu.db.controller;

import com.ccsu.db.pojo.Usr;
import com.ccsu.db.service.UsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsrController {

    @Autowired
    private UsrService usrService;

    @RequestMapping("/getAllUsr")
    @ResponseBody
    public List<Usr> getAllUsr() {
        return this.usrService.getAllUsr();
    }
}
