package com.example.SpringBoot.service;

import com.example.SpringBoot.dao.UserDao;
import com.example.SpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDao.flush();
    }

    @Override
    public User findById(Long id) {
        return userDao.getReferenceById(id);
    }

    @Override
    @Transactional
    public void remove(User user) {
        userDao.delete(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }
}