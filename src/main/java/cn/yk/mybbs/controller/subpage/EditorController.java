package cn.yk.mybbs.controller.subpage;

import cn.yk.mybbs.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.controller.subpage
 * <br> Description:
 * <br> Date: Created in 13:58 2017/1/3.
 * <br> Modified By
 *
 * @author SiGen
 */
@Controller
public class EditorController extends BaseController{
    @RequestMapping(value = "/mybbs/getEditor",method = {RequestMethod.GET,RequestMethod.POST})
    public String reply(){
        return "subpage/editor";
    }
}
