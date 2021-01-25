package com.edu.Servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Auther:haha
 * @Date:2021/1/25 - 01 - 25 14:19
 * @Description:com.edu.Servlet
 * @Version: 1.0
 */
//第三种创建servlet 继承 HttpServlet 也是最常用的
public class MyServlet3 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("进入doget===========");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入dopos============");
    }

  /*  @Override
    public void init() throws ServletException {
        System.out.println("初始化servlet=============");
    }
*/
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("初始化servlet=============");
        String name = config.getInitParameter("charsetname");
        System.out.println(name);
    }

    @Override
    public void destroy() {
        System.out.println("servlet销毁===============");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //派发器 用户请求调用相应的doget dopost
        System.out.println("进入service()方法===============");
        super.service(req, resp);
    }


}
