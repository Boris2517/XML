package com.bora.user.service;

import com.bora.user.entity.User;

import java.util.List;

public interface UserService {

    User updateUser(User user);
    User addNewUser(User user);
    List<User> getAllUsers();
    List<User> getApprovedUsers();
    List<User> getNotApprovedUsers();
}
