package com.example.userservice.controllers;

import com.example.userservice.payload.UserRegistrationRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(UserRegistrationController.class)
class UserRegistrationControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void shouldRegisterUser() throws Exception {

        UserRegistrationRequest userRegistrationRequest = new UserRegistrationRequest("username", "password");

        String requestJsonString = this.objectMapper.writeValueAsString(userRegistrationRequest);

        this.mockMvc.perform(
                MockMvcRequestBuilders.post("/users/register")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(requestJsonString)
            ).andExpect(MockMvcResultMatchers.status().isCreated());

    }
}