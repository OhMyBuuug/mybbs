package cn.yk.mybbs.dao;

import cn.yk.mybbs.model.user_test;

public interface user_testMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user_test record);

    int insertSelective(user_test record);

    user_test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user_test record);

    int updateByPrimaryKey(user_test record);
}