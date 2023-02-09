package com.study.study_springboot_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberWithAuthorityController {
    @RequestMapping(value = "/joinForm", method = RequestMethod.GET)
    public ModelAndView joinForm(ModelAndView modelAndView){
        String viewName = "/WEB-INF/views/member/joinForm.jsp";

        modelAndView.setViewName(viewName);
        return modelAndView;
    }

    @RequestMapping(value = "/joinProc", method = RequestMethod.POST)
    public String joinProc(ModelAndView modelAndView){
        return "redirect:/";
    }
}
