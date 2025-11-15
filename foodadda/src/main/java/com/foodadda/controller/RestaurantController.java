package com.foodadda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodadda.entity.Restaurant;
import com.foodadda.exception.AlreadyExist;
import com.foodadda.exception.ResourseNotFound;
import com.foodadda.service.RestaurantServiceImp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantServiceImp implementation;

    @PostMapping
    public ResponseEntity<?> saveRestaurant(@RequestBody Restaurant entity) throws AlreadyExist, ResourseNotFound {
        return new ResponseEntity<>(implementation.registerRestaurant(entity), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> saveRestaurant() {
        return new ResponseEntity<>(implementation.getAllRestaurants(), HttpStatus.CREATED);
    }

}
