package com.ccsu.db.dao;

import com.ccsu.db.pojo.Resource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResourceMapper {
    Resource queryById(int id);

    List<Resource> queryByUid(int uid);

    List<Resource> queryAll();

    int add(Resource resource);

    int delById(int id);

    int updateById(Resource resource);
}
