package com.greenfoxacademy.bankofsimbaa.controller;

import com.greenfoxacademy.bankofsimbaa.model.BankAccount;
import com.greenfoxacademy.bankofsimbaa.services.BankAccountService;
import com.greenfoxacademy.bankofsimbaa.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class WebController {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    private final
    BankService bankService;

    @Autowired
    public WebController(BankService bankService) {
        this.bankService = bankService;

    }
    @GetMapping(value={"", "accounts"})
    public String getAllAccounts(Model thymeLeafModel) {
        thymeLeafModel.addAttribute("accounts", bankService.getAllAccount());
        return "accounts";
    }

    @GetMapping("simba")
    public String getAllAccount(Model thymeLeafModel) {
        bankService.createSimba();
        thymeLeafModel.addAttribute("accounts", bankService.getAllAccount());
        return "accounts";
    }

    @GetMapping("zebra")
    public String getAllAccountZebra(Model thymeLeafModel) {
        bankService.createZebra();
        thymeLeafModel.addAttribute("accounts", bankService.getAllAccount());

        return "accounts";
    }

    @GetMapping("nala")
    public String getAllAccountNala(Model thymeLeafModel) {
        bankService.createNala();
        thymeLeafModel.addAttribute("accounts", bankService.getAllAccount());
        return "accounts";
    }

    @GetMapping("rafiki")
    public String getAllAccountRafiki(Model thymeLeafModel) {
        bankService.createRafiki();
        thymeLeafModel.addAttribute("accounts", bankService.getAllAccount());
        return "accounts";
    }

    @GetMapping("timon")
    public String getAllAccountTimon(Model thymeLeafModel) {
        bankService.createTimon();
        thymeLeafModel.addAttribute("accounts", bankService.getAllAccount());
        return "accounts";
    }

    @GetMapping("zordon")
    public String getAllAccountZordon(Model thymeLeafModel) {
        bankService.createZordon();
        thymeLeafModel.addAttribute("accounts", bankService.getAllAccount());
        return "accounts";
    }


    @GetMapping("shenzi")
    public String getAllAccountShenzi(Model thymeLeafModel) {
        bankService.createShenzi();
        thymeLeafModel.addAttribute("accounts", bankService.getAllAccount());
        return "accounts";
    }

    @RequestMapping("hello")
    public String htmlCeption(Model model) {
        model.addAttribute("enjoy", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "hello";
    }

    @PostMapping("balanceraise")
    public String increaseBalanceOfAccount(@PathVariable(value = "index") int index) {
        bankService.raiseTheBalance(index);
        return "accounts";
    }

   @GetMapping("newAccount")
    public String addNewAccount(@ModelAttribute BankAccount newAccount) {
        bankService.add(newAccount);
        return "newAccount";
    }


}
