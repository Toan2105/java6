package com.example.demo.controller;

import com.example.demo.bean.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/index")
    public String index(Model model) throws IOException {
        model.addAttribute("message", "Welcome to Thymeleaf");


        ObjectMapper mapper = new ObjectMapper();
        String path = "E:\\java6\\Bai3\\src\\main\\resources\\static\\Student.json";
        Student student = mapper.readValue(new File(path), Student.class);
        model.addAttribute("sv", student);

        return "/bai2/2.2/hello";
    }
}
