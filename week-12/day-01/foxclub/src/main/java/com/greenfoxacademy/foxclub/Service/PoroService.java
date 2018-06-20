package com.greenfoxacademy.foxclub.Service;

import com.greenfoxacademy.foxclub.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface PoroService {

    ArrayList<Fox> getAllAccount();

    void add(Fox foxes);


}
