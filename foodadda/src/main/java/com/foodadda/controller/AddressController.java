package com.foodadda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodadda.service.AddressServiceImp;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressServiceImp implementation;

}
