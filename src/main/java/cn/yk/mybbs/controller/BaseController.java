package cn.yk.mybbs.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.controller
 * <br> Description: 项目基类
 * <br> Date: Created in 11:39 2016/12/19.
 * <br> Modified By
 *
 * @author SiGen
 */
public class BaseController {
    public HttpServletRequest request;
    public HttpServletResponse response;

    public HttpSession httpSession;

    /**
     * <br> Description: 初始化参数
     * <br> Date: Created in 11:45 2016/12/19.
     * <br> Modified By
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     */
    @ModelAttribute
    public void inital(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.httpSession = request.getSession();
        httpSession.setAttribute("userID",1);
    }
}
