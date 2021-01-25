package com.edu.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Auther:haha
 * @Date:2021/1/25 - 01 - 25 16:25
 * @Description:com.edu.filter
 * @Version: 1.0
 */
public class CharEncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("charencodingfilter初始化========================");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //所有中文乱码统一utf-8
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        //调用下一个过滤器或web资源
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("charencodingfilter销毁========================");
    }
}
