package com.greenfoxacademy.greenfoxacademypractice.controllers;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Math.*;


@Controller
public class HelloWebController {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    AtomicLong counter = new AtomicLong();
    Random rnd = new Random();
    String[] fontColor = {"red", "blue", "green", "yellow", "orange", "pink", "lavender", "cyan", "maroon", "navy"};


    @RequestMapping("web/greeting")
    public String greeting(Model model,@RequestParam String name) {
        int helocounter = rnd.nextInt(hellos.length);
        int counterColor = rnd.nextInt(fontColor.length);
        int sizeFont = 15 + rnd.nextInt(40);
        model.addAttribute("hello",hellos[helocounter]);
        model.addAttribute("name", name);
        model.addAttribute("counter",counter.incrementAndGet());
        model.addAttribute("fontSize", sizeFont);
        model.addAttribute("fontColor", fontColor[counterColor]);
        return "greeting";
    }


}
