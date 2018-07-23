package com.yangying.por.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SendToPageController {

    @GetMapping("admin/{pageName}")
    public String sendToPage(@PathVariable("pageName") String pageName) {
        return pageName + "/" + pageName;
    }

    @GetMapping("/")
    public String welcome() {
        return "login/login";
    }
}
