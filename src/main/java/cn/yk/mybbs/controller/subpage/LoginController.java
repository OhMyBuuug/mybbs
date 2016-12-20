package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Project: mybbs
 * @Package: cn.yk.mybbs.controller.common
 * @Author: SiGen
 * @Description:
 * @Date: Created in 21:26 2016/12/20.
 * @Modified: By
 */
@Controller
public class LoginController extends BaseController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "subpage/login/login";
    }
}
