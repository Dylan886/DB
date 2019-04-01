package com.ccsu.db.service;

import com.ccsu.db.dao.UsrMapper;
import com.ccsu.db.pojo.Usr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsrService {

    @Autowired
    private UsrMapper usrMapper;

    public List<Usr> getAllUsr() {
        return usrMapper.getAllUser();
    }
}
