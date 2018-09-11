package com.estel.services.usermanagment.controller;

import com.estel.services.usermanagment.model.User;
import com.estel.services.usermanagment.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRespository userRespository;

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable Long userId){
        return userRespository.findById(userId).get();
    }

}
