package com.edu.Servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @Auther:haha
 * @Date:2021/1/25 - 01 - 25 14:09
 * @Description:com.edu.Servlet
 * @Version: 1.0
 */
//第一种创建servlet的方法 实现servlet这个接口
public class MyServlet implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
