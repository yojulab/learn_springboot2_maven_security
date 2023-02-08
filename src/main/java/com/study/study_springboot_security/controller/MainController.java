package com.study.study_springboot_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping({"/"})
    public ModelAndView main(ModelAndView modelAndView){
        String viewName = "/WEB-INF/views/main.jsp";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
