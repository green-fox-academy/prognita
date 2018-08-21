package com.greenfoxacademy.p2pchatapp.Service;

import com.greenfoxacademy.p2pchatapp.Model.Message;
import com.greenfoxacademy.p2pchatapp.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class messageServiceImpl implements messageService {
    @Override
    public void saveMessage(Message message, User user) {

    }

    @Override
    public List<Message> findAllMessages() {
        return null;
    }
}
