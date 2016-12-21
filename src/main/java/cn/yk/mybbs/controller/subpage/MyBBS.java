package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.controller.subpage
 * <br> Description: 子页面/论坛页面
 * <br> Date: Created in 9:10 2016/12/21.
 * <br> Modified By
 * @author SiGen
 */
@Controller
public class MyBBS extends BaseController{
    /**
     * <br> Description: 接收到/mybbs请求后,返回mybbs页面
     * <br> Date: Created in 9:12 2016/12/21.
     * <br> Modified By
     * @return "subpage/mybbs/mybbs"
     */
    @RequestMapping(value = "mybbs",method = RequestMethod.GET)
    public String mybbs(){
        return "subpage/mybbs/mybbs";
    }
}
