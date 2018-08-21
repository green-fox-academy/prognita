package com.greenfoxacademy.p2pchatapp.Service;

import com.greenfoxacademy.p2pchatapp.Model.User;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Override
    public void create(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public boolean isNameInTheList(String username) {
        return false;
    }

    @Override
    public boolean isUserExist() {
        return false;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }
}
