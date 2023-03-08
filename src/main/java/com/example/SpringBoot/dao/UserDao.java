package com.example.SpringBoot.dao;

import com.example.SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}