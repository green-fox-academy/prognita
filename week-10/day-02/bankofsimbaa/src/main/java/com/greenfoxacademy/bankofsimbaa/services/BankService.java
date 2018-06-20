package com.greenfoxacademy.bankofsimbaa.services;

import com.greenfoxacademy.bankofsimbaa.model.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BankService {

    void add(BankAccount bankAccount);

    ArrayList<BankAccount>getAllAccount();

    void createSimba();

    void createZebra();

    void createNala();

    void createRafiki();

    void createTimon();

    void createZordon();

    void createShenzi();

    void raiseTheBalance(int account);
}