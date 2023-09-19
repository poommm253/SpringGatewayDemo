package com.oauth.demo.userservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oauth.demo.userservice.model.User;
import com.oauth.demo.userservice.model.exception.ResourceNotFoundException;
import com.oauth.demo.userservice.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Get a User based on the given id from the database.
     * 
     * @param id - The id of the user.
     * @return - The user model with the provided id, if exist.
     * @throws ResourceNotFoundException if no user with the given id is found.
     */
    public User get(Long id) throws ResourceNotFoundException {
        Optional<User> existingUser = userRepository.findById(id);

        if (!existingUser.isPresent()) {
            throw new ResourceNotFoundException("User with the id " + id.toString() + " does not exist");
        }

        return existingUser.get();
    }
}
