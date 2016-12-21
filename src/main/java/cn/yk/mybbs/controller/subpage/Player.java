package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Project: mybbs
 * @Package: cn.yk.mybbs.controller.subpage
 * @Author: SiGen
 * @Description: 子页面/玩家页面
 * @Date: Created in 9:14 2016/12/21.
 * @Modified: By
 */
@Controller
public class Player extends BaseController {
    /**
     * @author: SiGen
     * @description: 接收到/player的请求后,返回player页面
     * @return: "subpage/player/player"
     * @date: Created in 9:15 2016/12/21.
     * @modified: By
     */
    @RequestMapping(value = "/player", method = RequestMethod.GET)
    public String player() {
        return "subpage/player/player";
    }
}
