package com.splitvue.controller;

import com.splitvue.delegate.UserDelegate;
import com.splitvue.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserDelegate userDelegate;

    @GetMapping
    public List<User> getAllUsers() {
        return userDelegate.fetchAllUsers();
    }
}
