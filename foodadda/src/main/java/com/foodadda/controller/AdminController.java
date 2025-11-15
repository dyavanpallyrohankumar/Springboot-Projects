package com.foodadda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodadda.exception.InvalidInputException;
import com.foodadda.exception.ResourseNotFound;
import com.foodadda.service.AdminServiceImp;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    AdminServiceImp implemenation;

    @GetMapping("/restaurants/approved")
    public ResponseEntity<?> getApproved() {
        return new ResponseEntity<>(implemenation.getApprovedRestaurant(), HttpStatus.OK);
    }

    @GetMapping("/restaurants/pending")
    public ResponseEntity<?> getPendind() {
        return new ResponseEntity<>(implemenation.getPendingRestaurant(), HttpStatus.OK);
    }

    @PutMapping("/restaurants/{id}/approve")
    public ResponseEntity<?> approve(@PathVariable Integer id) throws ResourseNotFound {
        return new ResponseEntity<>(implemenation.approveRestaurant(id), HttpStatus.OK);
    }

    @PutMapping("/restaurants/{id}/reject")
    public ResponseEntity<?> reject(@PathVariable Integer id) throws ResourseNotFound {
        return new ResponseEntity<>(implemenation.rejectRestaurant(id), HttpStatus.OK);
    }

    @DeleteMapping("/restaurants/{id}/remove")
    public ResponseEntity<?> remove(@PathVariable Integer id) throws ResourseNotFound, InvalidInputException {
        return new ResponseEntity<>(implemenation.removeRestaurant(id), HttpStatus.OK);
    }

}
