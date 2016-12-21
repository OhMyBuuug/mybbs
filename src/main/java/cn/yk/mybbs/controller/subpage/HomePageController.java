package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.controller.subpage
 * <br> Description: 子页面/首页
 * <br> Date: Created in 8:52 2016/12/21.
 * <br> Modified By
 * @author SiGen
 */
@Controller
public class HomePageController extends BaseController {
    /**
     * <br> Description: 接收到/homepage的请求后，返回homepage页面
     * <br> Date: Created in 9:05 2016/12/21.
     * <br> Modified By
     * @return "subpage/homepage/homepage"
     */
    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public String homePage() {
        return "subpage/homepage/homepage";
    }
}
