package com.edu.Servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @Auther:haha
 * @Date:2021/1/25 - 01 - 25 14:17
 * @Description:com.edu.Servlet
 * @Version: 1.0
 */
//第二种创建servlet 继承 GenericServlet
public class MyServlet2 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
