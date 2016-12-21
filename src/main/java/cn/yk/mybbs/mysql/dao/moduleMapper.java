package cn.yk.mybbs.mysql.dao;

import cn.yk.mybbs.mysql.model.module;

import java.util.List;

public interface moduleMapper {
    int deleteByPrimaryKey(Integer moduleid);

    int insert(module record);

    int insertSelective(module record);

    module selectByPrimaryKey(Integer moduleid);

    int updateByPrimaryKeySelective(module record);

    int updateByPrimaryKey(module record);

    // 获得所有的模块
    List<module> getAllModules();
}