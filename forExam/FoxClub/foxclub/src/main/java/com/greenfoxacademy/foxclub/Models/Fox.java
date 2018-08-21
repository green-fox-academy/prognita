package com.greenfoxacademy.foxclub.Models;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class Fox {


    String name;
    String food;
    String drink;
    List<String> tricks;
    List<Fox> foxes;
    String currentTrick;
    List<String> actions;

    public Fox() {
        this.name = "Mr Green";
        this.food = "Water";
        this.drink = "Mud";
        this.tricks = new ArrayList<>();
        this.currentTrick = "do nothing";

    }


    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public List<Fox> getFoxes(String name) {
        return foxes;
    }

    public void setFoxes(List<Fox> foxes) {
        this.foxes = foxes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void addTrick(String trick) {
        tricks.add(trick);
    }

    public List<String> getTricks() {
        return tricks;
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public String getCurrentTrick() {
        return currentTrick;
    }

    public void setCurrentTrick(String currentTrick) {
        this.currentTrick = currentTrick;
    }

    public boolean knowTricks() {
        boolean b;
        if (tricks.size() == 0) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public void addAction(String item, String action) {
        if (!this.drink.equals(item) && action=="drink") {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            this.actions.add(dateFormat.format(date)+" : Drink has been changed from:"+this.drink+" to:"+item);
        }
        if (!this.food.equals(item) && action=="food") {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            this.actions.add(dateFormat.format(date)+" : Food has been changed from:"+this.food+" to:"+item);
        }
        if (!this.tricks.contains(item) && action=="trick") {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            this.actions.add(dateFormat.format(date)+" : Learned to:"+item);
        }

}

