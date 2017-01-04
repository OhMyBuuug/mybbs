package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.common.RenderJson;
import cn.yk.mybbs.controller.BaseController;
import cn.yk.mybbs.mysql.model.reply;
import cn.yk.mybbs.service.IMyBBSOnloadService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.controller.subpage
 * <br> Description: 子页面/论坛页面
 * <br> Date: Created in 9:10 2016/12/21.
 * <br> Modified By
 *
 * @author SiGen
 */
@Controller
public class MyBBSController extends BaseController {
    @Resource
    private IMyBBSOnloadService iMyBBSOnloadService;

    /**
     * <br> Description: 接收到/mybbs请求后,返回mybbs页面
     * <br> Date: Created in 9:12 2016/12/21.
     * <br> Modified By
     *
     * @return "subpage/mybbs/mybbs"
     */
    @RequestMapping(value = "/mybbs", method = RequestMethod.GET)
    public String mybbs() {
        return "subpage/mybbs/mybbs";
    }

    /**
     * <br> Description: 获取 版块信息以及版块下的详细主题分类
     * <br> Date: Created in 15:40 2016/12/21.
     * <br> Modified By
     */
    @RequestMapping(value = "/mybbs/getModulesAndSections", method = RequestMethod.POST)
    public void getModulesAndSections() {
        HashMap<String, Object> resultmap = new HashMap<String, Object>();
        resultmap.put("modules", iMyBBSOnloadService.getMoudles());
        resultmap.put("sections", iMyBBSOnloadService.getSections());

        RenderJson.renderJSON(response, resultmap);
    }

    /**
     * <br> Description: 根据子模块ID查询该模块下的所有文章的基本信息
     * <br> Date: Created in 16:22 2017/1/1.
     * <br> Modified By
     */
    @RequestMapping(value = "/mybbs/selectArticleBaseInformationBySectionId", method = RequestMethod.POST)
    public void selectArticleBaseInformationBySectionId() {
        /**
         * 获得请求参数
         * sectionId: 当前子模块的ID
         * currentPageNumber: 当前页码
         * countPerPage: 每页显示文章的数量
         */
        String sectionId = request.getParameter("sectionId").replaceAll("-", "");
        String currentPageNumber = request.getParameter("pageNumber").replaceAll("-", "");
        String countPerPage = request.getParameter("countPerPage").replaceAll("-", "");

        int sectionID = Integer.parseInt(sectionId != null ? sectionId : "1");
        int pageSize = Integer.parseInt(countPerPage != null ? countPerPage : "20");
        int currentPage = Integer.parseInt(currentPageNumber != null ? currentPageNumber : "0");
        int startIndex = pageSize * currentPage;

        HashMap paramMap = new HashMap();
        paramMap.put("sectionId", sectionID);
        paramMap.put("startIndex", startIndex);
        paramMap.put("pageSize", pageSize);

        HashMap<String, Object> articleBaseInformation = new HashMap<String, Object>();
        articleBaseInformation.put("articleBaseInformation",
                iMyBBSOnloadService.selectArticleBaseInformationBySectionId(paramMap));

        RenderJson.renderJSON(response, articleBaseInformation);
    }

    /**
     * <br> Description: 根据文章ID查询内容
     * <br> Date: Created in 0:15 2017/1/2.
     * <br> Modified By
     */
    @RequestMapping(value = "/mybbs/selectArticleContentById", method = RequestMethod.POST)
    public void selectArticleContentById() {
        String articleId = request.getParameter("articleId").replaceAll("-", "");
        int articleID = Integer.parseInt(articleId != null ? articleId : "1");

        HashMap resultMap = new HashMap();
        resultMap.put("content", iMyBBSOnloadService.selectArticleContentById(articleID));

        RenderJson.renderJSON(response, resultMap);
    }

    /**
     * <br> Description: 根据当前文章的ID获得请求数量的回复
     * <br> Date: Created in 0:34 2017/1/2.
     * <br> Modified By
     */
    @RequestMapping(value = "/mybbs/selectReplyByArticleId", method = RequestMethod.POST)
    public void selectReplyByArticleId() {
        String articleId = request.getParameter("articleId");
        String currentPageNumber = request.getParameter("pageNumber");
        String countPerPage = request.getParameter("countPerPage");

        int articleID = Integer.parseInt(articleId != null ? articleId : "1");
        int pageSize = Integer.parseInt(countPerPage != null ? countPerPage : "20");
        int currentPage = Integer.parseInt(currentPageNumber != null ? currentPageNumber : "0");
        int startIndex = pageSize * currentPage;

        HashMap paramMap = new HashMap();
        paramMap.put("articleId", articleID);
        paramMap.put("startIndex", startIndex);
        paramMap.put("pageSize", pageSize);
        System.out.println(paramMap.toString());

        List<reply> replyList = iMyBBSOnloadService.selectReplyByArticleId(paramMap);
        RenderJson.renderJSON(response, replyList);
    }

    /**
     * <br> Description: 插入文章,并返回是否成功的标志
     * <br> Date: Created in 19:18 2017/1/2.
     * <br> Modified By
     */
    @RequestMapping(value = "/mybbs/insertArticle", method = RequestMethod.POST)
    public void insertArticle() {
        HashMap<String, Object> articleItems = new HashMap<>();

        String sectionID = request.getParameter("sectionID");
        String articleTitle = request.getParameter("articleTitle");
        Integer articleAuthorId = (Integer) httpSession.getAttribute("userID");
        String articleContent = request.getParameter("articleContent");
        String articleTag = request.getParameter("articleTag");

        articleItems.put("sectionID", sectionID);
        articleItems.put("articleTitle", articleTitle);
        articleItems.put("articleAuthorId", articleAuthorId);
        articleItems.put("articleContent", articleContent);
        articleItems.put("articleTag", articleTag);

        Integer count = iMyBBSOnloadService.insertArticle(articleItems);

        RenderJson.renderJSON(response, count);
    }

    /**
     * <br> Description: 向对应articleID的文章插入回复,并返回是否成功的标志
     * <br> Date: Created in 19:18 2017/1/2.
     * <br> Modified By
     */
    @RequestMapping(value = "/mybbs/insertReply", method = RequestMethod.POST)
    public void insertReply() {
        HashMap<String, String> replyItems = new HashMap();

        String articleID = request.getParameter("articleId");
        String replyerID = httpSession.getAttribute("userID").toString();
        String replyContent = request.getParameter("replyContent");

        System.out.println(replyContent);

        String referenceFloor = request.getParameter("referenceFloor");
        replyItems.put("articleID", articleID);
        replyItems.put("replyerID", replyerID);
        replyItems.put("replyContent", replyContent);
        replyItems.put("referenceFloor", referenceFloor);

        System.out.println(replyItems.toString());

        Integer count = iMyBBSOnloadService.insertReply(replyItems);

        RenderJson.renderJSON(response, count);
    }
}

