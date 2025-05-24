package com.splitvue.service.impl;

import com.splitvue.model.User;
import com.splitvue.repository.UserRepository;
import com.splitvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
