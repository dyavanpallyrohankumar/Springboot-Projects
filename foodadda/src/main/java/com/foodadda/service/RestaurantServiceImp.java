package com.foodadda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.foodadda.entity.*;
import com.foodadda.enums.RestaurantStatus;
import com.foodadda.exception.*;
import com.foodadda.interfaces.RestaurantService;
import com.foodadda.repository.*;

@Service
public class RestaurantServiceImp implements RestaurantService {
    @Autowired
    RestaurantRepository rRepository;
    @Autowired
    UserRepository uRepository;
    @Autowired
    AddressRepository aRepository;

    RestaurantStatus status;

    @Override
    public Restaurant registerRestaurant(Restaurant restaurant) throws AlreadyExist, ResourseNotFound {
        Optional<User> vendor = Optional.of(uRepository.findById(restaurant.getVendor().getId())
                .orElseThrow(() -> new ResourseNotFound("Vendor Doesnot Exist")));

        restaurant.setVendor(vendor.get());

        Optional<Restaurant> duplicate = rRepository.findByNameAndContactNumber(restaurant.getName(),
                restaurant.getContactNumber());
        if (duplicate.isPresent()) {
            throw new AlreadyExist("ALready Restaurant is registered");
        }
        restaurant.setStatus(RestaurantStatus.PENDING);
        Address address = aRepository.save(restaurant.getAddress());
        restaurant.setAddress(address);
        return rRepository.save(restaurant);
    }

    public List<Restaurant> getAllRestaurants() {
        return rRepository.findAll();
    }

    public Restaurant getRestaurantbyID(Integer id) throws InvalidInputException {
        if (id != null) {
            Optional<Restaurant> restaurant = rRepository.findById(id);
            if (restaurant.isPresent()) {
                return restaurant.get();
            }
        }
        throw new InvalidInputException("Enter the Valid Integer");
    }

}
