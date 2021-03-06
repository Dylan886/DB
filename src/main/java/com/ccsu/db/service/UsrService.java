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

    ///通过id查询
    public Usr selectByPrimaryKey(Integer id) {
        return usrMapper.selectByPrimaryKey(id);
    }
    //查出所有用户
    public List<Usr> getAllUsr() {
        return usrMapper.getAllUsr();
    }
    //增加用户
    public int insertSelective(Usr usr) {
        return usrMapper.insertSelective(usr);
    }
    //通过id更新信息
    public int updateByPrimaryKey(Usr user) {
        return usrMapper.updateByPrimaryKeySelective(user);
    }
    //通过id删除用户
    public int deleteByPrimaryKey(int id) {
        return usrMapper.deleteByPrimaryKey(id);
    }

    //登录操作
    public Usr login(String loginname, String password) {
        return usrMapper.login(loginname, password);
    }
}
