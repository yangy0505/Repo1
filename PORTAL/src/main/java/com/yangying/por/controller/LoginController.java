package com.yangying.por.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yangying.por.interceptor.CheckUserIsLoginInterceptor;
import com.yangying.por.pojo.SysUser;
import com.yangying.por.repos.SysUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    private SysUserRepo sysUserRepo;

    @Autowired
    private ObjectMapper om;

    @PostMapping("admin/login")  // http://localhost:8081/admin/login8
    public String login(SysUser sysUser, HttpSession session, HttpServletResponse response) throws JsonProcessingException, UnsupportedEncodingException {
        SysUser loginUser = sysUserRepo.findOne(sysUser.getName(), sysUser.getPassword());
        if (Objects.isNull(loginUser)) {
            return "redirect:./404";
        }
        else {
            session.setAttribute(CheckUserIsLoginInterceptor.USER_SESSION_KEY, loginUser);
            Cookie cookie = new Cookie("userInfo", URLEncoder.encode(om.writeValueAsString(loginUser), "UTF-8"));
            cookie.setPath("/admin/");
            response.addCookie(cookie);
            return "redirect:./index";
        }
    }
}
