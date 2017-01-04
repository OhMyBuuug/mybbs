package cn.yk.mybbs.mysql.dao;

import cn.yk.mybbs.mysql.model.reply;

import java.util.HashMap;
import java.util.List;

public interface replyMapper {
    /**
     * <br> Description: 根据文章ID及相应参数获得回复列表
     * <br> Date: Created in 0:37 2017/1/2.
     * <br> Modified By
     * @param paramMap 参数 articleId,startIndex,pageSize
     * @return List of reply 回复列表
     */
    List<reply> selectReplyByArticleId(HashMap paramMap);


    /**
     * <br> Description: 向对应articleID的文章中插入回复,并返回是否成功的标志
     * <br> Date: Created by SiGen in 19:42 2017/1/2.
     * <br> Modified By
     *
     * @param replyItems 回复相关内容
     * @return Integer 是否成功的标志
     */
    Integer insertReply(HashMap<String, String> replyItems);

    Integer selectCountOfReplyByArticleId(Integer articleId);

    int deleteByPrimaryKey(Integer replyid);

    int insert(reply record);

    int insertSelective(reply record);

    reply selectByPrimaryKey(Integer replyid);

    int updateByPrimaryKeySelective(reply record);

    int updateByPrimaryKey(reply record);

}