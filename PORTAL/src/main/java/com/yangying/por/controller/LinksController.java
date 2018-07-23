package com.yangying.por.controller;


import com.yangying.por.pojo.Score;
import com.yangying.por.repos.ScoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.JoinType;
import java.util.List;

@Controller
@RequestMapping("admin/links")
public class LinksController {

    @Autowired
    private ScoreRepo scoreRepo;
    @GetMapping("linksList")
    public String linksList(Model model) {
        List<Score> scoreList = scoreRepo.findAll((root, criteriaQuery, criteriaBuilder) -> {
            root.fetch("student", JoinType.INNER);
            return null;
        });
        model.addAttribute("scoreInfo", scoreList);
        return "links/linksList";
    }
}

