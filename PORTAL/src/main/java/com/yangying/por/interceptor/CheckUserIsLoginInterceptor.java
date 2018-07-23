package com.yangying.por.interceptor;

import com.yangying.por.pojo.SysUser;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

public class CheckUserIsLoginInterceptor extends HandlerInterceptorAdapter {

    public static final String USER_SESSION_KEY = "user_key";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        SysUser user = (SysUser) request.getSession().getAttribute(USER_SESSION_KEY);
        if (Objects.isNull(user)) {
            response.sendRedirect("/");
            return false;
        }
        return true;
    }
}
