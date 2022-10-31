package com.maneesha.rentacar.demoapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){

        return "Hello From Maneesha :) This is from GET";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greetingPost(){

        return "Hello From Maneesha :) This is from POST";
    }


}
