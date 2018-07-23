package com.yangying.por.controller;

import com.yangying.por.pojo.SysUser;
import com.yangying.por.repos.CourseRepo;
import com.yangying.por.pojo.Course;
import com.yangying.por.repos.SysUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.JoinType;
import java.util.List;


@Controller
@RequestMapping("admin/news")
public class NewsController {

    @Autowired
    private SysUserRepo sysUserRepo;
    @GetMapping("newsList4")
    public String newsList(Model model) {
        List<SysUser> sysUserList = sysUserRepo.findAll((root, criteriaQuery, criteriaBuilder) -> {
            return null;
        });
        model.addAttribute("sysUserInfo", sysUserList);
        return "news/newsList4";
    }
}
