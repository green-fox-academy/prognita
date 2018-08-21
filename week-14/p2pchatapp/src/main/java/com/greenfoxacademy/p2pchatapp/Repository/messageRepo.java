package com.greenfoxacademy.p2pchatapp.Repository;

import com.greenfoxacademy.p2pchatapp.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface messageRepo extends CrudRepository<Message,Long> {
}
