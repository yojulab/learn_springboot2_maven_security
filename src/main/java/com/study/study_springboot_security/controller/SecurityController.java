package com.study.study_springboot_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
    @GetMapping({"/admin"})     // 관리자 접속하는 곳
    public ModelAndView main(ModelAndView modelAndView){
        String viewName = "/WEB-INF/views/admin.jsp";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
    @GetMapping({"/loginForm"})     // 로그인 폼 작성
    public ModelAndView loginForm(ModelAndView modelAndView){
        String viewName = "/WEB-INF/views/security/loginForm.jsp";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
