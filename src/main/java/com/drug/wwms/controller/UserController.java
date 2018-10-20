package com.drug.wwms.controller;

import com.drug.wwms.bean.User;
import com.drug.wwms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/currentUser")
    public String currentUser(){
        return "1234";
    }

    @RequestMapping("/users")
    public List<User> getUsers(){
        List<User> users = userService.getUserList();
        System.out.println(users);
        return users;
    }
}
