package com.oauth.demo.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oauth.demo.userservice.model.User;
import com.oauth.demo.userservice.model.exception.ResourceNotFoundException;
import com.oauth.demo.userservice.service.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Get a User based on the given id.
     * 
     * @param id - The id of the user.
     * @return - The user model with the provided id, if exist.
     * @throws ResourceNotFoundException if no user with the given id is found.
     */
    @GetMapping(path = "/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") Long id) throws ResourceNotFoundException {
        return userService.get(id);
    }
}
