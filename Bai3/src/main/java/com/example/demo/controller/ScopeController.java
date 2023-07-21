package com.example.demo.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScopeController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpSession session;

    @Autowired
    ServletContext servletContext;


    @RequestMapping("/scope")
    public String index(Model model){
        model.addAttribute("a","I am in Model");
        request.setAttribute("b","I am in Request");
        session.setAttribute("c","I am in Session");
        servletContext.setAttribute("d","I am in Application");
        return "/bai2/2.7/scope/index";
    }
}
