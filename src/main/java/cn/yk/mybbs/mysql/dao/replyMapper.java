package cn.yk.mybbs.mysql.dao;

import cn.yk.mybbs.mysql.model.reply;

public interface replyMapper {
    int deleteByPrimaryKey(Integer replyid);

    int insert(reply record);

    int insertSelective(reply record);

    reply selectByPrimaryKey(Integer replyid);

    int updateByPrimaryKeySelective(reply record);

    int updateByPrimaryKey(reply record);
}