package com.prescription.prescriptionmanage.Webconfig.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 用户登录
 * 拦截器
 */
@Component
public class LoginInteceptor implements HandlerInterceptor {

    /**
     * 在请求被处理之前调用
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 检查每个到来的请求对应的session域中是否有登录标识
        //一般用户登录之后会存放session中  从session中获取用户登录信息
        HttpSession session= request.getSession();
        session.setMaxInactiveInterval(0);
        Object loginName = session.getAttribute("userId");
        Integer status = (Integer)session.getAttribute("status");
        //未登录时
        if (null == loginName || !(loginName instanceof String)) {
            // 未登录，重定向到登录页
            try {
                response.sendRedirect(request.getServletContext().getContextPath() + "/login.html");
            }catch (IOException e){
                e.getMessage();
            };
            System.out.println("=========该用户未登录========");
            return false;
        }
        System.out.println("=========该用已登录========");
        return true;
    }

    /**
     * 在请求被处理后，视图渲染之前调用
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }


    /**
     * 在整个请求结束后调用
     * @param request
     * @param response
     * @param handler
     * @param
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception {

    }
}
