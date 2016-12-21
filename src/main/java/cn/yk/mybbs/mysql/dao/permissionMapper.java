package cn.yk.mybbs.mysql.dao;

import cn.yk.mybbs.mysql.model.permission;

public interface permissionMapper {
    int deleteByPrimaryKey(Integer permissionid);

    int insert(permission record);

    int insertSelective(permission record);

    permission selectByPrimaryKey(Integer permissionid);

    int updateByPrimaryKeySelective(permission record);

    int updateByPrimaryKey(permission record);
}