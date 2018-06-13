package com.greenfoxacademy.dependency.Service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String> colors;
    Random random;
    String email;
    protected static final String VALID_EMAIL_MESSAGE = " is a valid email address.";
    protected static final String INVALID_EMAIL_MESSAGE = " is not a valid email address.";
    protected static final String EMAIL_PROMPT = " Please enter an email address into the URL to use this function.";
    protected static final String COLOUR_RED = "red";
    protected static final String COLOUR_GREEN = "green";
    protected static final String COLOUR_BLACK = "black";


    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public boolean validateEmail(String emailAddress){
        return emailAddress.contains("@") && emailAddress.contains(".");
    }


}