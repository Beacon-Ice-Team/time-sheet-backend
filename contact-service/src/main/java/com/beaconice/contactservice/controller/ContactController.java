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
@Api("contact controller")
@RequestMapping("/users")
public class ContactController {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/contact")
    public List<User> getDefaultWeek() { //testing get from backend

        List<User> userList = userRepository.findAll();
        return userList;
    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public List<User> getAllUser() {
//        return userRepository.findAll();
//    }
//    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
//    public User findByUsername(@PathVariable("username") String username) {
//        return userRepository.findByUsername(username);
//    }
}
