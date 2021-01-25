package com.edu.Servlet; /**
 * @Auther:haha
 * @Date:2021/1/25 - 01 - 25 17:18
 * @Description:${PACKAGE_NAME}
 * @Version: 1.0
 */

import com.edu.pojo.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String userCode=request.getParameter("userCode");
            String userPassword=request.getParameter("userPassword");
            //调用User Service的方法根据用户名去数据库查询有没有该用户  User user = userService.getUser(); 但这里不用 写个伪代码
            //假设有个用户
            User user = new User();
            user.setUserCode(userCode);
            user.setUserPassword(userPassword);
            if (null!=user){
                request.getSession().setAttribute("user",user);
                response.sendRedirect("/Servletdemo/admin/ok.jsp");
                System.out.println("ok===============");
            }else {
                System.out.println("no===============");
            }

    }
}
