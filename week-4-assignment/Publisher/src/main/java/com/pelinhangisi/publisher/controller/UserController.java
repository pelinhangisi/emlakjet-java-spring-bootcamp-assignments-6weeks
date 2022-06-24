package com.pelinhangisi.publisher.controller;


import com.pelinhangisi.publisher.dto.UserDto;

import com.pelinhangisi.publisher.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    //Postman üzerinden istek atabilmek adına yol
    @PostMapping("/users")
    public void createUser(@RequestBody UserDto userDto){
        userService.createUser(userDto);
    }
}
