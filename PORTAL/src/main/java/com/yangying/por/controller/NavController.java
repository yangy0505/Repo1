package com.yangying.por.controller;

import com.yangying.por.interceptor.CheckUserIsLoginInterceptor;
import com.yangying.por.pojo.Rpt;
import com.yangying.por.pojo.SysUser;
import com.yangying.por.repos.NavRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.criteria.JoinType;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by Dee on 2018/5/17.
 */
@Controller
@RequestMapping("admin/nav")
public class NavController {

    @Autowired
    private NavRepo navRepo;

    @GetMapping("navbars")
    @ResponseBody
    public List<Rpt> navBars(HttpSession session) {
        SysUser sysUser = (SysUser) session.getAttribute(CheckUserIsLoginInterceptor.USER_SESSION_KEY);
//      List<Object[]> datas = navRepo.findAllNavs();
        List<Object[]> datas = navRepo.findNavsByUserId(sysUser.getId());

        Map<Integer, Rpt> rpts = new HashMap<>();
        List<Object[]> subs = new ArrayList<>();
        for (Object[] data : datas) {
            Integer parentId = (Integer) data[7];
            if (parentId != -1) {
                subs.add(data);
            }
            else {
                Rpt rpt = toRpt(data);
                rpts.put(rpt.getId(), rpt);
            }
        }
        if (!subs.isEmpty()) {
            for (Object[] sub : subs) {
                Integer parentId = (Integer) sub[7];
                Rpt parent = rpts.get(parentId);
                if (Objects.nonNull(parent)) {
                    parent.getChildren().add(toRpt(sub));
                }
            }
        }
        return Arrays.asList(rpts.values().toArray(new Rpt[0]));
    }

    private static Rpt toRpt(Object[] data) {
        Rpt rpt = new Rpt();
        rpt.setId((Integer) data[0]);
        rpt.setName((String) data[1]);
        rpt.setUrl((String) data[2]);
        rpt.setFlag(true);
        rpt.setTimeIns((Date) data[4]);
        rpt.setTimeUpd((Date) data[5]);
        rpt.setIcon((String) data[6]);
        return rpt;
    }
}
