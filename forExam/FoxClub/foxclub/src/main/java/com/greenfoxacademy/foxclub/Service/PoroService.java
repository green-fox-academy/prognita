package com.greenfoxacademy.foxclub.Service;

import com.greenfoxacademy.foxclub.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface PoroService {

    ArrayList<Fox> getAllAccount();

    void add(Fox foxes);

    ArrayList<String> tricks = new ArrayList<>();

    ArrayList<String> foods = new ArrayList<>();

    ArrayList<String> drinks = new ArrayList<>();


}
