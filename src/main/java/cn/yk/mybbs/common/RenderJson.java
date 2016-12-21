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
    /**
     * @author: SiGen
     * @description: 调用doRender返回JSON
     * @param response 当前会话
     * @param bean 需要转为JSON字符串的对象
     * @return: void
     * @date: Created in 9:56 2016/12/21.
     * @modified: By
     */
    public static void renderJSON(HttpServletResponse response,Object bean){
        doRender(response, JSON.toJSONString(bean),"text/html;charset=UTF-8");
    }
    /**
     * @author: SiGen
     * @description: 返回JSON
     * @param response 当前会话
     * @param message 需要传输的JSON字符串
     * @param charSet 字符串所用的字符集
     * @return: void
     * @date: Created in 9:56 2016/12/21.
     * @modified: By
     */
    public static void doRender(HttpServletResponse response,CharSequence message,String charSet){
        /**
         * 设置JSON字符串的字符集
         */
        response.setContentType(charSet);
        /**
         * 向会话中写入数据
         */
        try {
            PrintWriter printWriter = response.getWriter();
            printWriter.write(message.toString());
            System.out.println(message.toString());
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
