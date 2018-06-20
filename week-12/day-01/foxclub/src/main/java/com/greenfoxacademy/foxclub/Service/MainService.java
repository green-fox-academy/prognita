package com.greenfoxacademy.foxclub.Service;

import com.greenfoxacademy.foxclub.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MainService implements PoroService {

    private ArrayList<Fox> foxes = new ArrayList<>();

    @Override
    public ArrayList<Fox> getAllAccount() {
        return foxes;
    }

    @Override
    public void add(Fox fox) {
        foxes.add(fox);

    }
}
