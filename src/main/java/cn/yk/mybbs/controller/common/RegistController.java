package cn.yk.mybbs.controller.common;

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
    @RequestMapping(value = "/regist",method = RequestMethod.GET)
    public String regist(){
        return "subpage/regist/regist";
    }
}
