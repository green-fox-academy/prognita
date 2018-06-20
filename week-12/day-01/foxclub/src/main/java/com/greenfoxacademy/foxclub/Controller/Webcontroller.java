package com.greenfoxacademy.foxclub.Controller;

import com.greenfoxacademy.foxclub.Models.Fox;
import com.greenfoxacademy.foxclub.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Webcontroller {

    @Autowired
    MainService service;

    @Autowired
    Fox fox;


    @GetMapping(value = "/")
    public String index(Model nameModel,@RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return "login";
        }
        nameModel.addAttribute("name", name);
        return "index";
    }


    @PostMapping(value = "/foxName")
    public String login(@RequestParam(value = "foxName") String name) {
        return "redirect:/?name=" + name;
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }



}
