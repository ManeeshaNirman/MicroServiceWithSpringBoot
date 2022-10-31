package com.maneesha.rentacar.demoapplication.service;

import com.maneesha.rentacar.demoapplication.model.User;
import com.maneesha.rentacar.demoapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override

    public User save(User user) {

        return userRepository.save(user);

    }
}
