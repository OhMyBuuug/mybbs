package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Project: mybbs
 * @Package: cn.yk.mybbs.controller.subpage
 * @Author: SiGen
 * @Description: 子页面/论坛页面
 * @Date: Created in 9:10 2016/12/21.
 * @Modified: By
 */
@Controller
public class MyBBS extends BaseController{
    /**
     * @author: SiGen
     * @description: 接收到/mybbs请求后,返回mybbs页面
     * @return: "subpage/mybbs/mybbs"
     * @date: Created in 9:12 2016/12/21.
     * @modified: By
     */
    @RequestMapping(value = "mybbs",method = RequestMethod.GET)
    public String mybbs(){
        return "subpage/mybbs/mybbs";
    }
}
