package com.foodadda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodadda.entity.Menu;
import com.foodadda.exception.ResourseNotFound;
import com.foodadda.service.MenuServiceImp;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    MenuServiceImp implementation;

    @PostMapping
    public ResponseEntity<?> getMethodName(@RequestBody Menu menu) throws ResourseNotFound {
        return new ResponseEntity<>(implementation.addDish(menu.getRestaurant().getId(), menu), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putMethodName(@PathVariable Integer id, @RequestBody Menu updated)
            throws ResourseNotFound {
        return new ResponseEntity<>(implementation.updateDish(id, updated), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMethodName(@PathVariable Integer id, @RequestBody Menu updated)
            throws ResourseNotFound {
        return new ResponseEntity<>(implementation.updateDish(id, updated), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMethodName(@PathVariable Integer id) {
        return new ResponseEntity<>(implementation.getMenuByRestaurant(id), HttpStatus.OK);
    }

}
// this menu api can be accesed by any user like customer admin vendor for
// delete update create so we need to validation or make security for the api so
// that vendor only can create and update and delete And user only can see th
// list od menu items