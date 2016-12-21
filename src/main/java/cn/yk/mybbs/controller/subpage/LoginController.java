package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.common.RenderJson;
import cn.yk.mybbs.controller.BaseController;
import cn.yk.mybbs.model.user_test;
import cn.yk.mybbs.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.xml.registry.infomodel.User;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.controller.common
 * <br> Description: 子页面/登录
 * <br> Date: Created in 21:26 2016/12/20.
 * <br> Modified By
 * @author SiGen
 */
@Controller
public class LoginController extends BaseController {
    @Resource
    private IUserService iUserService;
    /**
     * <br> Description: 接收到/login请求时，返回login页面
     * <br> Date: Created in 22:48 2016/12/20.
     * <br> Modified By
     * @return "subpage/login/login"
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "subpage/login/login";
    }

    // 测试JSON
    @RequestMapping(value = "/login/getTest",method = RequestMethod.POST)
    public void getTest(){
        user_test u = this.iUserService.getUserById(1);
        RenderJson.renderJSON(response,u);
    }
}
