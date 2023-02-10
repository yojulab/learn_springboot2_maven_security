package com.study.study_springboot_security.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManagerController {
  
    @GetMapping({"/admin/*"})     // ROLE_ADMIN
    public ModelAndView admin(ModelAndView modelAndView){
        String viewName = "/WEB-INF/views/admin/read.jsp";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
    @GetMapping({"/manager/*"})   // ROLE_MANAGER or ROLE_ADMIN
    public ModelAndView manager(ModelAndView modelAndView){
        String viewName = "/WEB-INF/views/manager/read.jsp";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
