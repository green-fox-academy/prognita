package com.greenfoxacademy.p2pchatapp.Repository;

import com.greenfoxacademy.p2pchatapp.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface userRepo extends CrudRepository<User,Long> {

}
