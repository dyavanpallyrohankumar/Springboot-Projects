package com.foodadda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.foodadda.entity.User;
import com.foodadda.exception.AlreadyExist;
import com.foodadda.exception.InvalidCredintials;
import com.foodadda.service.UserServiceImp;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserServiceImp implementation;

    @PostMapping
    public ResponseEntity<User> getMethodName(@Valid @RequestBody User user) throws AlreadyExist {
        return new ResponseEntity<>(implementation.registerUser(user), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(implementation.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> credianlsmap(@RequestParam String contactNumber, @RequestParam String password)
            throws InvalidCredintials {
        return new ResponseEntity<>(implementation.loginUser(contactNumber, password), HttpStatus.ACCEPTED);
    }

    @GetMapping("/logout")
    public ResponseEntity<?> logoutrequest() {
        return new ResponseEntity<>(implementation.logoutUser(), HttpStatus.OK);
    }

}
