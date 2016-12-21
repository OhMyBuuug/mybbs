package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Project: mybbs
 * @Package: cn.yk.mybbs.controller.common
 * @Author: SiGen
 * @Description: 子页面/登录
 * @Date: Created in 21:26 2016/12/20.
 * @Modified: By
 */
@Controller
public class LoginController extends BaseController {
    /**
     * @author: SiGen
     * @description: 接收到/login请求时，返回login页面
     * @return: "subpage/login/login"
     * @date: Created in 22:48 2016/12/20.
     * @modified: By
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "subpage/login/login";
    }
}
