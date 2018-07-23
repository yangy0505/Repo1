package com.yangying.por.controller;

import com.yangying.por.interceptor.CheckUserIsLoginInterceptor;
import com.yangying.por.pojo.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Dee on 2018/5/25.
 */
@Controller
@RequestMapping("admin/info")
public class InfoController {

    @RequestMapping("current-user-info")
    public String currentUserInfo(HttpSession session) {
        return "info/userInfo";
    }
}
