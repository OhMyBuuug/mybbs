package mybbs;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import cn.yk.mybbs.common.RenderJson;
import cn.yk.mybbs.controller.BaseController;
import cn.yk.mybbs.model.user_test;
import cn.yk.mybbs.service.IUserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/user")
public class UserController extends BaseController {
   @Resource  
   private IUserService userService;
     
   @RequestMapping("/showUser")  
   public String toIndex(HttpServletRequest request,Model model){
       int userId = Integer.parseInt(request.getParameter("id"));  
       user_test user = this.userService.getUserById(userId);
       model.addAttribute("user", user);  
       return "showUser"; 
   }

   @RequestMapping(value = "/getUserMessage")
   public void getUserMessage(){
       int userID = Integer.parseInt(request.getParameter("id"));
       user_test user = this.userService.getUserById(userID);
       RenderJson.renderJSON(response,user);
   }
}  