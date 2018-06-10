package com.greenfoxacademy.bankofsimbaa.services;

import com.greenfoxacademy.bankofsimbaa.model.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class BankAccountService implements com.greenfoxacademy.bankofsimbaa.services.BankService {

    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    @Override
    public void add(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public ArrayList<BankAccount> getAllAccount() {

        return bankAccounts;
    }

    @Override
    public void createSimba() {
        bankAccounts.add(new BankAccount("Simba", 1200.0, "LION", true));


    }

    @Override
    public void createZebra() {
        bankAccounts.add(new BankAccount("Zebra", 200.0, "ZEBRA"));
    }

    @Override
    public void createNala() {
        bankAccounts.add(new BankAccount("Nala", 350.0, "LION"));
    }

    @Override
    public void createRafiki() {
        bankAccounts.add(new BankAccount("Rafiki", 100.0, "Monkey"));

    }

    @Override
    public void createTimon() {
        bankAccounts.add(new BankAccount("Timon", 200.0, "Szurikata"));

    }


    @Override
    public void createZordon() {
        bankAccounts.add(new BankAccount("Zordon", 40.0, "LION"));

    }

    @Override
    public void createShenzi() {
        bankAccounts.add(new BankAccount("Shenzi", 102.0, "hyena"));

    }

    @Override
    public void increaseBalance(BankAccount currentBankAccount) {
        if (currentBankAccount.accountKing(currentBankAccount).equals("King")) {
            currentBankAccount.setBalance(currentBankAccount.getBalance() + 100);
        } else {
            currentBankAccount.setBalance(currentBankAccount.getBalance() + 10);
        }
    }
}


