package cn.yk.mybbs.common;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Project: mybbs
 * @Package: cn.yk.mybbs.common
 * @Author: SiGen
 * @Description: 返回JSON
 * @Date: Created in 11:51 2016/12/19.
 * @Modified: By
 */
public class RenderJson {
    public static void renderJSON(HttpServletResponse response,Object bean){
        doRender(response, JSON.toJSONString(bean),"text/html;charset=UTF-8");
    }
    public static void doRender(HttpServletResponse response,CharSequence message,String charSet){
        response.setContentType(charSet);
        try {
            PrintWriter printWriter = response.getWriter();
            // printWriter.write(message.toString());
            printWriter.write(message.toString());
            System.out.println(message.toString());
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
