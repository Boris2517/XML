package com.bora.user.controller;

import com.bora.user.entity.User;
import com.bora.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PutMapping("/")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User updatedUser = userService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.ACCEPTED);
    }

    @PostMapping("/")
    public  ResponseEntity<User> addNewUser(@RequestBody User user){
        User newUser = userService.addNewUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.ACCEPTED);
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.ACCEPTED);
    }

    @GetMapping("/approved")
    public ResponseEntity<List<User>> getApprovedUsers(){
        List<User> users = userService.getApprovedUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @GetMapping("/notApproved")
    public ResponseEntity<List<User>> getNotApprovedUsers(){
        List<User> users = userService.getNotApprovedUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
