package com.greenfoxacademy.foxclub.Controller;

import com.greenfoxacademy.foxclub.Models.Fox;
import com.greenfoxacademy.foxclub.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Webcontroller {


    @Autowired
    MainService service;

    @Autowired
    Fox fox;


    List<String> foods = java.util.Arrays.asList("pizza", "gyros", "hamburger");
    List<String> drinks = java.util.Arrays.asList("lemonade", "beer", "coke");

    @GetMapping(value = "/")
    public String index(Model nameModel, @RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return "login";
        }
        nameModel.addAttribute("name", name);
        nameModel.addAttribute("foods", fox.getFood());
        nameModel.addAttribute("drink", fox.getDrink());
        nameModel.addAttribute("nbtricks", fox.getTricks().size());
        nameModel.addAttribute("knowtricks", fox.knowTricks());
        nameModel.addAttribute("tricks", fox.getTricks());
        nameModel.addAttribute("currentTrick", fox.getCurrentTrick());

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


    @GetMapping("/pfc/nutritionStore")
    public String nutrition(@RequestParam("name") String name, Model model, ArrayList<String> foods, ArrayList<String> drinks) {
        model.addAttribute("name", name);
        model.addAttribute("drinks", fox.getDrink());
        model.addAttribute("foods", fox.getFood());
        return "nutrition";
    }

    @PostMapping(value = "/pfc/nutritionStore")
    public String nutritionBack(@ModelAttribute("drink") String drink,
                                @ModelAttribute("food") String food,
                                @ModelAttribute("name") String name) {
        fox.addAction(drink, "drink");
        fox.addAction(food, "food");
        fox.setDrink(drink);
        fox.setFood(food);
        return "redirect:/pfc/information?name="+name;
    }

    @GetMapping("/pfc/trickCenter")
    public String trick(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("tricks", service.getMainTricks((Fox) fox.getFoxes(name)));
        model.addAttribute("hasTrickToLearn", service.hasTrickToLearn((Fox) fox.getFoxes(name)));
        return "trickpage";
    }

    @PostMapping(value = "/pfc/trickCenter")
    public String trickBack(@ModelAttribute(value="trick") String trick,
                            @ModelAttribute("name") String name) {
        fox.addAction(trick, "trick");
        fox.addTrick(trick);
        return "redirect:/pfc/information?name="+name;
    }

}
