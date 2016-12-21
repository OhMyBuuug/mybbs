package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.controller.subpage
 * <br> Description: 子页面/玩家页面
 * <br> Date: Created in 9:14 2016/12/21.
 * <br> Modified By
 * @author SiGen
 */
@Controller
public class Player extends BaseController {
    /**
     * <br> Description: 接收到/player的请求后,返回player页面
     * <br> Date: Created in 9:15 2016/12/21.
     * <br> Modified By
     * @return "subpage/player/player"
     */
    @RequestMapping(value = "/player", method = RequestMethod.GET)
    public String player() {
        return "subpage/player/player";
    }
}
