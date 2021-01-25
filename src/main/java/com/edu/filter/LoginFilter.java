package com.edu.filter;

import com.edu.pojo.User;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther:haha
 * @Date:2021/1/25 - 01 - 25 16:25
 * @Description:com.edu.filter
 * @Version: 1.0
 */
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LoginFilter========================");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
     //判断用户是否登录 去判断session中有没有用户
        HttpServletRequest servletRequest1 = (HttpServletRequest) servletRequest;
        HttpServletResponse servletResponse1 =(HttpServletResponse) servletResponse;
        User user = (User) servletRequest1.getSession().getAttribute("user");
        if (null==user){
            servletResponse1.sendRedirect("/Servletdemo/jsp/error.jsp");
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {
        System.out.println("LoginFilter========================");
    }
}
