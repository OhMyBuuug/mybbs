package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Project: mybbs
 * @Package: cn.yk.mybbs.controller.common
 * @Author: SiGen
 * @Description:
 * @Date: Created in 21:33 2016/12/20.
 * @Modified: By
 */
@Controller
public class RegistController extends BaseController {
    /**
     * @author: SiGen
     * @description: 接受到/regist请求时，返回regist页面
     * @param null
     * @return: "subpage/regist/regist"
     * @date: Created in 22:44 2016/12/20.
     * @modified: By  
     */
    
    @RequestMapping(value = "/regist",method = RequestMethod.GET)
    public String regist(){
        return "subpage/regist/regist";
    }
}
