package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.controller.common
 * <br> Description: 子页面/注册
 * <br> Date: Created in 21:33 2016/12/20.
 * <br> Modified By
 * @author SiGen
 */
@Controller
public class RegistController extends BaseController {
    /**
     * <br> Description: 接受到/regist请求时，返回regist页面
     * <br> Date: Created in 22:44 2016/12/20.
     * <br> Modified By
     * @return "subpage/regist/regist"
     */
    @RequestMapping(value = "/regist", method = RequestMethod.GET)
    public String regist() {
        return "subpage/regist/regist";
    }
}
