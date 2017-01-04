package cn.yk.mybbs.mysql.dao;

import cn.yk.mybbs.mysql.model.section;

import java.util.List;

public interface sectionMapper {
    int deleteByPrimaryKey(Integer sectionid);

    int insert(section record);

    int insertSelective(section record);

    section selectByPrimaryKey(Integer sectionid);

    int updateByPrimaryKeySelective(section record);

    int updateByPrimaryKey(section record);

    // 获得所有的子分类
    List<section> getAllSections();
}