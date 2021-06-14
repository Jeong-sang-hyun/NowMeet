package com.nowMeet.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping(value="/main")
public class HelloController {

    @RequestMapping(value="/main")
    public String hello(HttpServletRequest request, HttpServletResponse response) {
        return "/jsp/main/main";
    }
}