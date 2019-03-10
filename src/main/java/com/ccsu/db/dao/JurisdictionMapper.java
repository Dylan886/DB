package com.ccsu.db.dao;

import com.ccsu.db.pojo.Jurisdiction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface JurisdictionMapper {
    Jurisdiction queryById(int id);

    List<Jurisdiction> queryAll();

    int add(Jurisdiction jurisdiction);

    int delById(int id);

    int updateById(Jurisdiction urisdiction);
}
