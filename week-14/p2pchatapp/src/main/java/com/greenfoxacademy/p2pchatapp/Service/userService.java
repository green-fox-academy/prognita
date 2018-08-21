package com.greenfoxacademy.p2pchatapp.Service;

import com.greenfoxacademy.p2pchatapp.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface userService {

    void create(User user);
    void delete(int id);
    void update(User user);
    boolean isNameInTheList(String username);
    boolean isUserExist();
    User getUserById(int id);
}
