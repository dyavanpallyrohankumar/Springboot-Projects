package com.foodadda.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodadda.entity.Restaurant;
import com.foodadda.enums.RestaurantStatus;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
    Optional<Restaurant> findByNameAndContactNumber(String name, String ContactNumber);

    List<Restaurant> findByStatus(RestaurantStatus pending);

    List<Restaurant> findByRatingLessThan(Double rating);

}
