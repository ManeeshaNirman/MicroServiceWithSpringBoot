package com.maneesha.rentacar.demoapplication.controller;

import com.maneesha.rentacar.demoapplication.model.User;
import com.maneesha.rentacar.demoapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){

        return "Hello From Maneesha :) This is from GET";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greetingPost(){

        return "Hello From Maneesha :) This is from POST";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User save(@RequestBody User user){
     return userService.save(user);
    }


}
