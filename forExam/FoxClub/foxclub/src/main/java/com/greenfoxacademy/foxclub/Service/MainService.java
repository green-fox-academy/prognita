package com.greenfoxacademy.foxclub.Service;

import com.greenfoxacademy.foxclub.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MainService implements PoroService{

    private ArrayList<Fox> foxes = new ArrayList<>();

    @Override
    public ArrayList<Fox> getAllAccount() {
        return foxes;
    }

    @Override
    public void add(Fox fox) {
        foxes.add(fox);

    }

    public ArrayList<String> getMainTricks(Fox fox) {
        ArrayList<String> currentTricks=new ArrayList<>();
        for (String tr:this.tricks) {
            if (!fox.getTricks().contains(tr)) {
                currentTricks.add(tr);
            }
        }
        return currentTricks;
    }


    public boolean hasTrickToLearn(Fox fox) {
        ArrayList<String> currentTricks=new ArrayList<>();
        boolean hasTrick=false;
        for (String tr:this.tricks) {
            if (!fox.getTricks().contains(tr)) {
                currentTricks.add(tr);
            }
        }
        if (currentTricks.size()>0) {
            hasTrick=true;
        }
        return hasTrick;
    }

    public ArrayList<String> getMainFoods(Fox fox) {
        ArrayList<String> currentFoods=new ArrayList<>();
        for (String f:this.foods) {
            if (!fox.getFood().equals(f)) {
                currentFoods.add(f);
            }
        }
        return currentFoods;
    }

    public ArrayList<String> getMainDrinks(Fox fox) {
        ArrayList<String> currentDrinks=new ArrayList<>();
        for (String d:this.drinks) {
            if (!fox.getDrink().equals(d)) {
                currentDrinks.add(d);
            }
        }
        return currentDrinks;
    }


}
