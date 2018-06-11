package com.greenfoxacademy.dependency.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer{

    @Qualifier("myColorGrey")
    @Autowired
    MyColor myColor;

    public Printer() {
        System.out.println(LocalDateTime.now() + "Létrejöttem");
    }

    public void log(String message) {
        myColor.printColor();
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
        }

}
