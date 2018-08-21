package com.greenfox.controller;

import com.greenfox.model.User;
import com.greenfox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

    UserService userService;

    public AppController(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    User user;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("users", userService.getAll());
        model.addAttribute("firstName",user.getFirstName());
        model.addAttribute("lastName",user.getLastName());
        return "index";
    }

    @PostMapping("/app")
    public String create(Model model, @ModelAttribute(value = "firstName") String firstName, @ModelAttribute(value = "lastName") String lastName) {
        userService.save(new User(firstName, lastName));
        return "redirect:/";
    }
}