package com.project.mypro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.mypro.model.User;
import com.project.mypro.service.UserService;

@Controller
@RequestMapping("/board")
public class AccountController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/login", method = {RequestMethod.POST})
    public String login() {
        return "board/login";
    }

    @GetMapping("/register")
    public String register() {
        return "board/register";
    }

    @PostMapping("/register")
    public String register(User user) {
        userService.save(user);
//        SecurityContextHolder.clearContext();
        return "redirect:/board/login";
    }
}

