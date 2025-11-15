package com.foodadda.interfaces;

import com.foodadda.entity.Restaurant;
import com.foodadda.exception.AlreadyExist;
import com.foodadda.exception.ResourseNotFound;

public interface RestaurantService {
    public Restaurant registerRestaurant(Restaurant restaurant) throws AlreadyExist, ResourseNotFound;

}