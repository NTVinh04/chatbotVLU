package com.vlu.chatbot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Home(){
        return "home";
    }
    @GetMapping("/login")
    public String Login(){
        return "login";
    }
}
