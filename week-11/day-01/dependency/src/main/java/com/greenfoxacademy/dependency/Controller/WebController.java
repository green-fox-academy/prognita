package com.greenfoxacademy.dependency.Controller;

import com.greenfoxacademy.dependency.Service.StudentService;
import com.greenfoxacademy.dependency.Service.UtilityService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/useful")
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

    @Autowired
    private StudentService studentService;



    @RequestMapping("/useful/gfa")
    public String gfa(Model model) {
        model.addAttribute("numbers",studentService.findAll().size());
        return "gfa";
    }

    @RequestMapping("/useful/gfa/list")
    public String gfalist(Model model) {
        model.addAttribute("gfalist",studentService.findAll());
        return "list";
    }

    @RequestMapping("/useful/gfa/add")
    public String addgfa(Model model) {

        return "add";
    }


    @RequestMapping(value = "/useful/gfa/save",  method = RequestMethod.POST)
    public String savegfa(Model model, @RequestParam("name") String name) {
            model.addAttribute("name", name);
            studentService.save(name);
        return "redirect:/list.html";
    }

    @RequestMapping("/useful/gfa/check")
    public String checkgfa(Model model) {

        return "check";
    }

}
