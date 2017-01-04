package cn.yk.mybbs.service.impl;

import cn.yk.mybbs.mysql.dao.articleMapper;
import cn.yk.mybbs.mysql.dao.moduleMapper;
import cn.yk.mybbs.mysql.dao.replyMapper;
import cn.yk.mybbs.mysql.dao.sectionMapper;
import cn.yk.mybbs.mysql.model.article;
import cn.yk.mybbs.mysql.model.module;
import cn.yk.mybbs.mysql.model.reply;
import cn.yk.mybbs.mysql.model.section;
import cn.yk.mybbs.service.IMyBBSOnloadService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.service.impl
 * <br> Description:
 * <br> Date: Created in 15:00 2016/12/21.
 * <br> Modified By
 *
 * @author SiGen
 */
@Service("iMyBBSOnloadService")
public class IMyBBSOnloadServiceImpl implements IMyBBSOnloadService {

    @Resource
    private moduleMapper iModuleMapper;
    @Resource
    private sectionMapper iSectionMapper;
    @Resource
    private articleMapper iArticleMapper;
    @Resource
    private replyMapper iReplyMapper;
    /**
     * <br> Description: 获取所有的模块
     * <br> Date: Created in 17:38 2016/12/21.
     * <br> Modified By
     *
     * @return List of module
     */
    @Override
    public List<module> getMoudles() {
        List<module> modules = iModuleMapper.getAllModules();
        System.out.println(modules.toString());

        return modules;
    }

    /**
     * <br> Description: 获取所有的子模块
     * <br> Date: Created in 17:38 2016/12/21.
     * <br> Modified By
     *
     * @return List of section
     */
    @Override
    public List<section> getSections() {
        List<section> sections = iSectionMapper.getAllSections();
        System.out.println(sections.toString());

        return sections;
    }

    /**
     * <br> Description: 根据当前模块的ID,页码,每页显示的文章条数获取相应的文章的基本信息
     * <br> @param sectionId
     * <br> @param currentPageNumber
     * <br> @param countPerPage
     *
     * @return List of article
     */
    @Override
    public List<article> selectArticleBaseInformationBySectionId(HashMap paramMap) {

        List<article> articles = iArticleMapper.
                selectArticleBaseInformationBySectionId(paramMap);
        System.out.println(articles.toString());

        return articles;
    }

    /**
     * <br> Description: 根据文章ID获得文章内容
     * <br> Date: Created in 0:16 2017/1/2.
     * <br> Modified By
     *
     * @param articleID 文章ID
     * @return java.lang.String
     */
    @Override
    public String selectArticleContentById(int articleID) {
        String content = iArticleMapper.selectArticleContentById(articleID);

        return content;
    }

    /**
     * <br> Description: 根据文章ID及相应参数获得回复列表
     * <br> Date: Created in 0:37 2017/1/2.
     * <br> Modified By
     * @param paramMap 参数 articleId,startIndex,pageSize
     * @return List of reply 回复列表
     */
    @Override
    public List<reply> selectReplyByArticleId(HashMap paramMap) {

        List<reply> replyList = iReplyMapper.selectReplyByArticleId(paramMap);

        return replyList;
    }

    /**
     * <br> Description: 向指定sectionID的模块下插入文章,并返回是否成功的标识
     * <br> Date: Created by SiGen in 19:25 2017/1/2.
     * <br> Modified By
     *
     * @param articleItems 文章相关内容
     * @return Boolean 是否成功的标志
     */
    @Override
    public Integer insertArticle(HashMap<String, Object> articleItems) {
        Integer count = iArticleMapper.insertArticle(articleItems);

        return count;
    }

    /**
     * <br> Description: 向对应articleID的文章中插入回复,并返回是否成功的标志
     * <br> Date: Created by SiGen in 19:27 2017/1/2.
     * <br> Modified By
     *
     * @param replyItems 回复相关内容
     * @return Boolean 是否成功的标志
     */
    @Override
    public Integer insertReply(HashMap<String, String> replyItems) {
        Integer articleId = Integer.parseInt(replyItems.get("articleID"));
        String replyFloor = iReplyMapper.selectCountOfReplyByArticleId(articleId)+1+"";

        replyItems.put("replyFloor",replyFloor);
        Integer count = iReplyMapper.insertReply(replyItems);

        return count;
    }
}
