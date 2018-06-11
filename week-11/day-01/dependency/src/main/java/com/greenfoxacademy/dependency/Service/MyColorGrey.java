package com.greenfoxacademy.dependency.Service;

import org.springframework.stereotype.Service;

@Service
public class MyColorGrey implements MyColor {
    @Override
    public void printColor() {
        System.out.println("Greeeeey");
    }
}
