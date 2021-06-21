package com.nowMeet.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class mainController {
    @RequestMapping(value="/main", method = { RequestMethod.GET, RequestMethod.POST})
    public String main(HttpServletRequest request, HttpServletResponse response) {
        return "/jsp/main/main";
    }
}
