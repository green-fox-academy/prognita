package com.greenfoxacademy.p2pchatapp.Service;

import com.greenfoxacademy.p2pchatapp.Model.Message;
import com.greenfoxacademy.p2pchatapp.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface messageService {
    void saveMessage(Message message, User user);
    List<Message> findAllMessages();
}
