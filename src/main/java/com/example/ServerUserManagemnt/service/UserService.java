package com.example.ServerUserManagemnt.service;

import com.example.ServerUserManagemnt.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
