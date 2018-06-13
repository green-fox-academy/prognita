package com.greenfoxacademy.dependency.Controller;

import com.greenfoxacademy.dependency.Service.UtilityService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    private final
    UtilityService utilityService;

    @Autowired
    public WebController(UtilityService utilityService) {
        this.utilityService = utilityService;

    }

    @GetMapping("/useful")
    public String index() {
        return "useful";
    }

    @GetMapping("")
    public String mainPage() {
        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String colorBgPage(Model model) {
        model.addAttribute("bgcolor",utilityService.randomColor());
        return "colored";
    }

    @RequestMapping(value="/useful/email")
        public String isEmailValid(Model model, @RequestParam("email") String email){
            model.addAttribute("valid", utilityService.validateEmail(email));
            model.addAttribute("address", email);
            return "email";
    }

}
