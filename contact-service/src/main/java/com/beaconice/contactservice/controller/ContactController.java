package com.beaconice.contactservice.controller;

import com.beaconice.contactservice.domain.User;
import com.beaconice.contactservice.domain.Request;
import com.beaconice.contactservice.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class ContactController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public User findByUsername(@PathVariable("username") String username) {
        return userRepository.findByUsername(username);
    }
}
