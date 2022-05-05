package com.bora.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    //get list of all users
    RequestMapping<List<User>> getAllUsers(){

    }

    //get list of approved users
    //get list of users that are waiting for approve

}
