package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Project: mybbs
 * @Package: cn.yk.mybbs.controller.subpage
 * @Author: SiGen
 * @Description: 子页面/首页
 * @Date: Created in 8:52 2016/12/21.
 * @Modified: By
 */
@Controller
public class HomePageController extends BaseController {
    /**
     * @author: SiGen
     * @description: 接收到/homepage的请求后，返回homepage页面
     * @return:
     * @date: Created in 9:05 2016/12/21.
     * @modified: By
     */
    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public String homePage() {
        return "subpage/homepage/homepage";
    }
}
