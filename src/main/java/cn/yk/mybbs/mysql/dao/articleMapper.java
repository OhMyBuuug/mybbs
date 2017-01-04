package cn.yk.mybbs.mysql.dao;

import cn.yk.mybbs.mysql.model.article;
import cn.yk.mybbs.mysql.model.reply;

import java.util.HashMap;
import java.util.List;

public interface articleMapper {
    /**
     * <br> Description: 根据当前模块的ID,查询的初始位置,每页显示的文章条数获取相应的文章的基本信息
     * <br> @param sectionId
     * <br> @param startIndex
     * <br> @param countPerPage
     * @return List of article
     */
    List<article> selectArticleBaseInformationBySectionId(HashMap paramMap);

    /**
     * <br>Description: 根据文章ID查询文章内容
     * @param articleID 文章ID
     * @return String 文章内容
     */
    String selectArticleContentById(int articleID);

    /**
     * <br> Description: 向指定sectionID的模块下插入文章,并返回是否成功的标识
     * <br> Date: Created by SiGen in 19:40 2017/1/2.
     * <br> Modified By
     *
     * @param articleItems 文章相关内容
     * @return Integer 是否成功的标志
     */
    Integer insertArticle(HashMap<String, Object> articleItems);

    int deleteByPrimaryKey(Integer artcileid);

    int insert(article record);

    int insertSelective(article record);

    article selectByPrimaryKey(Integer artcileid);

    int updateByPrimaryKeySelective(article record);

    int updateByPrimaryKey(article record);
}