package com.foodadda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.foodadda.entity.*;
import com.foodadda.enums.*;
import com.foodadda.exception.InvalidInputException;
import com.foodadda.exception.ResourseNotFound;
import com.foodadda.interfaces.AdminService;
import com.foodadda.repository.*;

@Service
public class AdminServiceImp implements AdminService {
    @Autowired
    RestaurantRepository rRepository;

    @Autowired
    UserRepository uRepository;

    @Autowired
    RestaurantServiceImp rImplementation;

    public boolean isAdmin(Integer id) throws InvalidInputException {
        if (id != null) {
            Optional<User> admin = uRepository.findById(id);
            if (admin.isPresent()) {
                return admin.get().getUserRole() == UserRole.ADMIN ? true : false;
            }
        }
        throw new InvalidInputException("Enter the Valid Integer");
    }

    @Override
    public List<Restaurant> getLowRatingRestaurant(double rating) {
        return rRepository.findByRatingLessThan(rating);
    }

    @Override
    public String rejectRestaurant(Integer id) throws ResourseNotFound {
        Optional<Restaurant> restaurant = rRepository.findById(id);
        if (restaurant.isPresent()) {
            restaurant.get().setStatus(RestaurantStatus.REJECTED);
            return restaurant.get().getName() + " Restaurant Rejected";
        }
        throw new ResourseNotFound("No Restaurant Found by " + id);
    }

    @Override
    public String approveRestaurant(Integer id) throws ResourseNotFound {
        Optional<Restaurant> restaurant = rRepository.findById(id);
        if (restaurant.isPresent()) {
            restaurant.get().setStatus(RestaurantStatus.APPROVED);
            return restaurant.get().getName() + " Restaurant Approved";
        }
        throw new ResourseNotFound("No Restaurant Found by " + id);
    }

    @Override
    public List<Restaurant> getPendingRestaurant() {
        return rRepository.findByStatus(RestaurantStatus.PENDING);
    }

    @Override
    public String removeRestaurant(Integer id) throws ResourseNotFound, InvalidInputException {
        Restaurant restaurant = rImplementation.getRestaurantbyID(id);
        rRepository.delete(restaurant);
        return restaurant.getName() + " Restaurant Removed";
    }

    public List<Restaurant> getApprovedRestaurant() {
        return rRepository.findByStatus(RestaurantStatus.APPROVED);
    }

}
