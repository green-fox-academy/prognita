package com.greenfoxacademy.greenfoxacademypractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreenfoxacademypracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreenfoxacademypracticeApplication.class, args);


    }
    /*
    REST és WEB-es Controllerek vannak, webes controller esetén webről fogadunk és webnek továbbítunk
    REST controller esetén csak adatot adunk és továbbítunk, nincs köze közvetlen weboldalhoz (de lehet)
    REST - > JSON vagy XML


    Vannak peoplecontrollerek -> get/friend és event controllerek


     */
}
