package cn.yk.mybbs.dao;

import cn.yk.mybbs.model.module;

public interface moduleMapper {
    int deleteByPrimaryKey(Integer moduleid);

    int insert(module record);

    int insertSelective(module record);

    module selectByPrimaryKey(Integer moduleid);

    int updateByPrimaryKeySelective(module record);

    int updateByPrimaryKey(module record);
}