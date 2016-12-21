package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Project: mybbs
 * @Package: cn.yk.mybbs.controller.subpage
 * @Author: SiGen
 * @Description: 子页面/厂商页面
 * @Date: Created in 9:08 2016/12/21.
 * @Modified: By
 */
@Controller
public class Manufacturer extends BaseController {
    /**
     * @author: SiGen
     * @description: 接收到/manucfacturer的请求后,返回manufacturer页面
     * @return: "subpage/manufacturer/manufacturer"
     * @date: Created in 9:09 2016/12/21.
     * @modified: By
     */
    @RequestMapping(value = "/manufacturer", method = RequestMethod.GET)
    public String manufacturer() {
        return "subpage/manufacturer/manufacturer";
    }
}
