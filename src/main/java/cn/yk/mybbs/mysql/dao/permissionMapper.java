package cn.yk.mybbs.dao;

import cn.yk.mybbs.model.permission;

public interface permissionMapper {
    int deleteByPrimaryKey(Integer permissionid);

    int insert(permission record);

    int insertSelective(permission record);

    permission selectByPrimaryKey(Integer permissionid);

    int updateByPrimaryKeySelective(permission record);

    int updateByPrimaryKey(permission record);
}