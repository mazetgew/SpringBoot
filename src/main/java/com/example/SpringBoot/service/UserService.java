package com.example.SpringBoot.service;

import com.example.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void update(User user);

    User findById(Long id);

    void remove(User user);

    List<User> listUsers();
}
