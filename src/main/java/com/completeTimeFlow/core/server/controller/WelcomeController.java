package com.completeTimeFlow.core.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${myproperty}")   // Gets the field "myproperty" from the "core-java8-dev.properties" of Config Server
    private String myProperty;

    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to Spring Application with Security";
    }

    @RequestMapping("/myproperty")
    public String myProperty() {
        return "The property is: " + myProperty;
    }
}
