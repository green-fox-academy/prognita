package com.greenfox.service;

import com.greenfox.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by aze on 25/10/17.
 */
@Service
public class UserService {

    public UserService() {
        this.users = new ArrayList<>();
    }

    private ArrayList<User> users;


    public ArrayList<User> getAll() { return users;
    }

    public void save(User user) {
        users.add(user);
    }

}
