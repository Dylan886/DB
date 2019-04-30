package com.ccsu.db.service;


import com.ccsu.db.dao.ResourceMapper;
import com.ccsu.db.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    @Autowired
    ResourceMapper resourceMapper;
    //通过主键查询资源
    public Resource selectByPrimaryKey(int id) {
        return this.resourceMapper.selectByPrimaryKey(id);
    }

    public List<Resource> queryByUid(int uid) {
        return null;
    }
    //更新不为空的部分，会判断字段是否为null
    public int updateByPrimaryKey(Resource resource) {
        return this.resourceMapper.updateByPrimaryKeySelective(resource);
    }
    //插入新资源
    public int insert(Resource resource) {
        return this.resourceMapper.insert(resource);
    }

    public List<Resource> queryAll() {
        return resourceMapper.queryAll();
    }
    //通过id删除指定资源
    public int deleteByPrimaryKey(int id) {
        return this.resourceMapper.deleteByPrimaryKey(id);
    }

}
