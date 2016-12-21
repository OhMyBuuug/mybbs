package cn.yk.mybbs.dao;

import cn.yk.mybbs.model.section;

public interface sectionMapper {
    int deleteByPrimaryKey(Integer sectionid);

    int insert(section record);

    int insertSelective(section record);

    section selectByPrimaryKey(Integer sectionid);

    int updateByPrimaryKeySelective(section record);

    int updateByPrimaryKeyWithBLOBs(section record);

    int updateByPrimaryKey(section record);
}