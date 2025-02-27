package com.campushub.community.controller.interceptor;

import com.campushub.community.annotation.LoginRequired;
import com.campushub.community.util.HostHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * ClassName: LoginRequiredInterceptor
 * Package: com.campushub.community.controller.interceptor
 * Description:检查登录状态 拦截器
 *              在方法执行前，进行拦截，检查是否处于登陆状态
 *
 * @Author 欣欣欣
 * @Create 2025/2/27 12:20
 * @Version 1.0
 */
@Component
public class LoginRequiredInterceptor implements HandlerInterceptor {
    @Autowired
    private HostHolder hostHolder;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            LoginRequired loginRequired = method.getAnnotation(LoginRequired.class);
            if (loginRequired != null && hostHolder.getUser() == null) {
                response.sendRedirect(request.getContextPath() + "/login"); //若有此注解且未登录，强制重定向到登陆页面
                return false;
            }
        }
        return true;
    }
}
