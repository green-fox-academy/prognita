package com.greenfoxacademy.dependency.Service;

import org.springframework.stereotype.Service;

@Service
public class MyColorPink implements MyColor {
    @Override
    public void printColor() {
        System.out.println("pink");
    }
}
