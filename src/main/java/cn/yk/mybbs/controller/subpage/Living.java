package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Project: mybbs
 * @Package: cn.yk.mybbs.controller.subpage
 * @Author: SiGen
 * @Description: 子页面/直播
 * @Date: Created in 8:57 2016/12/21.
 * @Modified: By
 */
@Controller
public class Living extends BaseController {
    /**
     * @author: SiGen
     * @description: 接收到/living请求后，返回living页面
     * @return: "subpage/living/living"
     * @date: Created in 9:02 2016/12/21.
     * @modified: By
     */
    @RequestMapping(value = "/living", method = RequestMethod.GET)
    public String living() {
        return "subpage/living/living";
    }
}
