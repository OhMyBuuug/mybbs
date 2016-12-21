package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.common.RenderJson;
import cn.yk.mybbs.controller.BaseController;
import cn.yk.mybbs.service.IMyBBSOnloadService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.controller.subpage
 * <br> Description: 子页面/论坛页面
 * <br> Date: Created in 9:10 2016/12/21.
 * <br> Modified By
 * @author SiGen
 */
@Controller
public class MyBBSController extends BaseController{
    @Resource
    private IMyBBSOnloadService iMyBBSOnloadService;
    /**
     * <br> Description: 接收到/mybbs请求后,返回mybbs页面
     * <br> Date: Created in 9:12 2016/12/21.
     * <br> Modified By
     * @return "subpage/mybbs/mybbs"
     */
    @RequestMapping(value = "/mybbs",method = RequestMethod.GET)
    public String mybbs(){
        return "subpage/mybbs/mybbs";
    }
    /**
     * <br> Description: 获取 版块信息以及版块下的详细主题分类
     * <br> Date: Created in 15:40 2016/12/21.
     * <br> Modified By
     */
    @RequestMapping(value = "/mybbs/getModulesAndSections",method = RequestMethod.POST)
    public void getModulesAndSections(){
        HashMap<String,Object> resultmap = new HashMap<>();
        resultmap.put("modules",iMyBBSOnloadService.getMoudles());
        resultmap.put("sections",iMyBBSOnloadService.getSections());

        RenderJson.renderJSON(response,resultmap);
    }
}

