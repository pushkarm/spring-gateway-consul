package com.example.userservice.controllers;

import com.example.userservice.payload.UserRegistrationRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/users/register")
    public void register(@RequestBody UserRegistrationRequest registrationRequest) {
        System.out.println("Created the user");
    }
}
