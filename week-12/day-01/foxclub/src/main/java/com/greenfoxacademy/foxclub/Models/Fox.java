package com.greenfoxacademy.foxclub.Models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {


        String name;
        String food;
        String drink;
        List<String> tricks;
        List<Fox> foxes;

        public Fox(){
            this.name = "Mr Green";
            this.food = "";
            this.drink = "Mud";
            this.tricks = new ArrayList<>();

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

}

