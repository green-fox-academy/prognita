package com.greenfox.reddit.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GenericService <Type> {

    void addItem(Type item);

    List<Type> getAllItem();

    void deleteItem(Type item);

    void updateItem(Type item);

    Type findItemById(Long id);
}
