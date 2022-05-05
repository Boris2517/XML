package com.bora.user.service;

import com.bora.user.entity.User;
import com.bora.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User updateUser(User user) {
        return userRepository.findByUsername(user.getUsername());
    }

    @Override
    public User addNewUser(User user) {
        user.setApproved(false);
        user.setPublicProfile(true);
        return userRepository.insert(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getApprovedUsers() {
        return userRepository.findByApproved(true);
    }

    @Override
    public List<User> getNotApprovedUsers() {
        return userRepository.findByApproved(false);
    }


}
