package cn.yk.mybbs.mysql.dao;

import cn.yk.mybbs.mysql.model.article;

public interface articleMapper {
    int deleteByPrimaryKey(Integer artcileid);

    int insert(article record);

    int insertSelective(article record);

    article selectByPrimaryKey(Integer artcileid);

    int updateByPrimaryKeySelective(article record);

    int updateByPrimaryKey(article record);
}