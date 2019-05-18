package com.ccsu.db.service;

import com.ccsu.db.dao.JurisdictionMapper;
import com.ccsu.db.pojo.Jurisdiction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JurisdictionService {
    @Autowired
    private JurisdictionMapper jurisdictionMapper;
    //插入一条新纪录
    public int insert(Jurisdiction jurisdiction){
        return this.jurisdictionMapper.insert(jurisdiction);
    }
    //根据id删除
    public int deleteByPrimaryKey(int id){
        return this.jurisdictionMapper.deleteByPrimaryKey(id);
    }
    //根据id修改
    public int updateByPrimaryKey(Jurisdiction jurisdiction){
        return this.jurisdictionMapper.updateByPrimaryKeySelective(jurisdiction);
    }
    //根据id查询
    public Jurisdiction selectByPrimaryKey(int id){
        return this.jurisdictionMapper.selectByPrimaryKey(id);
    }
    //
    public List<Jurisdiction> queryAll(){
        return jurisdictionMapper.queryAll();
    }

    public String getJurisdictionById(int id) {
        return this.jurisdictionMapper.getJurisdictionById(id);
    }
}
