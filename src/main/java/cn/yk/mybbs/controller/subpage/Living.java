package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <br> Project mybbs
 * <br> Package cn.yk.mybbs.controller.subpage
 * <br> Description: 子页面/直播
 * <br> Date: Created in 8:57 2016/12/21.
 * <br> Modified: By
 * @author SiGen
 */
@Controller
public class Living extends BaseController {
    /**
     * <br> Description 接收到/living请求后，返回living页面
     * <br> Date: Created in 9:02 2016/12/21.
     * <br> Modified: By
     * @return "subpage/living/living"
     */
    @RequestMapping(value = "/living", method = RequestMethod.GET)
    public String living() {
        return "subpage/living/living";
    }
}
