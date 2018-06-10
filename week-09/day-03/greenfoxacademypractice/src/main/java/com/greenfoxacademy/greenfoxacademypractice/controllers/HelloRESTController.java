package com.greenfoxacademy.greenfoxacademypractice.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong id = new AtomicLong();
    AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public List<Greeting> greeting(@RequestParam String name) {
        return Arrays.asList(
                new Greeting(id.incrementAndGet(), "Hello " + name + "! This site was loaded " + counter.incrementAndGet()+" times since last server start.")
        );
    }

    public class HelloWebController {
        @RequestMapping("web/greeting")
        public String greeting(Model model) {
            model.addAttribute("name", " World");
            return "greeting";
        }
    }


}

