package com.greenfoxacademy.bankofsimbaa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Id;
    String name;
    Double balance;
    String animalType;
    boolean isKing;

    public BankAccount(String name, Double balance, String animalType) {

        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public BankAccount(String name, Double balance, String animalType, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }

    public BankAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public String accountKing(BankAccount bankAccount) {
        if (bankAccount.isKing()) {
            return "King";
        } else {
            return "not king";
        }
    }

    public String accountBadGuy(BankAccount bankAccount) {
        if (bankAccount.animalType == "LION") {
            if (bankAccount.name == "Zordon") {
                return "Bad Guy";
            }
        } else if (bankAccount.animalType == "hyena") {
            return "Bad Guy";
        }
        return "Good Guy";
    }



}


