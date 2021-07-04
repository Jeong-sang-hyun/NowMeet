package com.nowMeet.main.controller;

import com.nowMeet.main.bean.BoardBean;
import com.nowMeet.main.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class mainController {

    @Autowired
    private BoardService boardService;



    @RequestMapping(value="/main", method = { RequestMethod.GET, RequestMethod.POST})
    public String main(HttpServletRequest request, HttpServletResponse response) {
        List<BoardBean> boardList  = boardService.selectBoardList();

        return "/main/main";
    }
}
