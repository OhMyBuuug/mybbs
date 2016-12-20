package cn.yk.mybbs.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Project: mybbs
 * @Package: cn.yk.mybbs.controller
 * @Author: SiGen
 * @Description: 项目基类
 * @Date: Created in 11:39 2016/12/19.
 * @Modified: By
 */
public class BaseController {
    public HttpServletRequest request;
    public HttpServletResponse response;
    /**
     * @author: SiGen
     * @description: 初始化参数
     * @param request
     * @param response
     * @return: void
     * @date: Created in 11:45 2016/12/19.
     * @modified: By
     */
    @ModelAttribute
    public void Inital(HttpServletRequest request,HttpServletResponse response){
        this.request = request;
        this.response = response;
    }
}
