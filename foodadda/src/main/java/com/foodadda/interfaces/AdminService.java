package com.foodadda.interfaces;

import java.util.List;

import com.foodadda.entity.Restaurant;
import com.foodadda.exception.InvalidInputException;
import com.foodadda.exception.ResourseNotFound;

public interface AdminService {
    public List<Restaurant> getLowRatingRestaurant(double rating);

    public String rejectRestaurant(Integer id) throws ResourseNotFound;

    public String approveRestaurant(Integer id) throws ResourseNotFound;

    public List<Restaurant> getPendingRestaurant();

    public String removeRestaurant(Integer id) throws ResourseNotFound, InvalidInputException;

}
