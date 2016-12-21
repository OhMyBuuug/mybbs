package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.controller.subpage
 * <br> Description: 子页面/厂商页面
 * <br> Date: Created in 9:08 2016/12/21.
 * <br> Modified By
 * @author SiGen
 */
@Controller
public class Manufacturer extends BaseController {
    /**
     * <br> Description: 接收到/manucfacturer的请求后,返回manufacturer页面
     * <br> Date: Created in 9:09 2016/12/21.
     * <br> Modified By
     * @return "subpage/manufacturer/manufacturer"
     */
    @RequestMapping(value = "/manufacturer", method = RequestMethod.GET)
    public String manufacturer() {
        return "subpage/manufacturer/manufacturer";
    }
}
