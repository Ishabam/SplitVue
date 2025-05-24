package com.splitvue.delegate;

import com.splitvue.model.User;
import com.splitvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class UserDelegate {

    @Autowired
    private UserService userService;

    public List<User> fetchAllUsers() {
        return userService.getAllUsers();
    }
}
