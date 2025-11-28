package com.vlu.chatbot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String Home(){
        return "home";
    }
    @GetMapping("/")
    public String Login(){
        return "login";
    }
    @GetMapping("/forgot-password")
    public String Forgot(){
        return "forgot";
    }

    @Controller
    public class ChatController {
            @GetMapping("/chat")
            public String chatPage(Model model) {
                String selectedUser = null; // hoặc tên user thực nếu đã chọn
                model.addAttribute("selectedUser", selectedUser);
                return "chat/home"; // dẫn tới home.html

            }

    }

}
