package cn.yk.mybbs.service;

import cn.yk.mybbs.mysql.model.article;
import cn.yk.mybbs.mysql.model.module;
import cn.yk.mybbs.mysql.model.reply;
import cn.yk.mybbs.mysql.model.section;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.service
 * <br> Description: mybbs页面加载时调用的服务
 * <br> Date: Created in 14:58 2016/12/21.
 * <br> Modified By
 *
 * @author SiGen
 */
@Service("iMyBBSOnloadService")
public interface IMyBBSOnloadService {
    /**
     * <br> Description: 获取所有模块
     * <br> Date: Created in 17:34 2016/12/21.
     * <br> Modified By
     * @return List of module
     */
    public abstract List<module> getMoudles();
    /**
     * <br> Description: 获取所有子模块
     * <br> Date: Created in 17:35 2016/12/21.
     * <br> Modified By
     * @return List of section
     */
    public abstract List<section> getSections();

    /**
     * <br> Description: 根据当前模块的ID,页码,每页显示的文章条数获取相应的文章的基本信息
     * <br> @param sectionId
     * <br> @param currentPageNumber
     * <br> @param countPerPage
     * @return List of article
     */
    public abstract List<article> selectArticleBaseInformationBySectionId(HashMap paramMap);

    /**
     * <br> Description: 根据文章ID查询文章内容
     * <br> Date: Created in 0:16 2017/1/2.
     * <br> Modified By
     * @param articleID
     */
    public String selectArticleContentById(int articleID);

    /**
     * <br> Description: 根据文章ID查询回复
     * <br> Date: Created in 0:35 2017/1/2.
     * <br> Modified By
     * @param paramMap
     * @return
     */
    public List<reply> selectReplyByArticleId(HashMap paramMap);

    /**
     * <br> Description: 向指定sectionID的模块下插入文章,并返回是否成功的标识
     * <br> Date: Created by SiGen in 19:25 2017/1/2.
     * <br> Modified By
     * @param articleItems 文章相关内容
     * @return Integer 是否成功的标志
     */
    public Integer insertArticle(HashMap<String, Object> articleItems);

    /**
     * <br> Description: 向对应articleID的文章中插入回复,并返回是否成功的标志
     * <br> Date: Created by SiGen in 19:27 2017/1/2.
     * <br> Modified By
     * @param replyItems 回复相关内容
     * @return Integer 是否成功的标志
     */
    public Integer insertReply(HashMap<String, String> replyItems);
}
