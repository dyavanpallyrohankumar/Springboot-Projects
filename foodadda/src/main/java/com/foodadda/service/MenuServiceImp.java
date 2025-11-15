package com.foodadda.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodadda.entity.Menu;
import com.foodadda.entity.Restaurant;
import com.foodadda.enums.DishType;
import com.foodadda.enums.RestaurantStatus;
import com.foodadda.exception.ResourseNotFound;
import com.foodadda.interfaces.MenuService;
import com.foodadda.repository.MenuRepository;
import com.foodadda.repository.RestaurantRepository;

@Service
public class MenuServiceImp implements MenuService {
    @Autowired
    private MenuRepository mRepository;
    @Autowired
    private RestaurantRepository rRepository;

    // -------------------- ADD DISH --------------------
    @Override
    public Menu addDish(Integer restaurantId, Menu menu) throws ResourseNotFound {

        Restaurant restaurant = rRepository.findById(restaurantId)
                .orElseThrow(() -> new ResourseNotFound("Restaurant not found"));

        // Restaurant must be approved

        if (restaurant.getStatus() != RestaurantStatus.APPROVED) {
            throw new IllegalStateException("Restaurant is not approved by admin");
        }
        // Validate dish name starts with uppercase
        if (!menu.getName().matches("^[A-Z][a-zA-Z ]+$")) {
            throw new IllegalArgumentException("Dish name must start with uppercase and contain only alphabets/spaces");
        }

        boolean exists = Arrays
                .stream(DishType.values())
                .anyMatch(c -> c.name()
                        .equalsIgnoreCase(menu.getType().toString()));

        // Validate dish type
        if (!exists) {
            throw new IllegalArgumentException("Invalid dish type");
        }

        if (menu.getPrice() <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        // Dish already exists?
        mRepository.findByNameAndRestaurantId(menu.getName(), restaurantId).ifPresent(d -> {
            throw new IllegalStateException("Dish already exists for this restaurant");
        });

        menu.setRestaurant(restaurant);
        menu.setRating(2.5); // default rating

        return mRepository.save(menu);
    }

    // -------------------- UPDATE DISH --------------------
    @Override
    public Menu updateDish(Integer menuId, Menu updated) throws ResourseNotFound {

        Menu menu = mRepository.findById(menuId)
                .orElseThrow(() -> new ResourseNotFound("Dish not found"));

        if (!updated.getName().matches("^[A-Z][a-zA-Z ]+$")) {
            throw new IllegalArgumentException("Dish name must start with uppercase and contain only alphabets/spaces");
        }

        // Validate dish type
        boolean exists = Arrays.stream(DishType.values())
                .anyMatch(c -> c.name().equalsIgnoreCase(menu.getType().toString()));

        if (exists) {
            throw new IllegalArgumentException("Invalid dish type");
        }

        if (updated.getPrice() <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        // update all fields except rating
        menu.setName(updated.getName());
        menu.setType(updated.getType());
        menu.setDescription(updated.getDescription());
        menu.setSpecialty(updated.getSpecialty());
        menu.setPrice(updated.getPrice());

        return mRepository.save(menu);
    }

    // -------------------- DELETE DISH --------------------
    @Override
    public void deleteDish(Integer menuId) throws ResourseNotFound {
        Menu menu = mRepository.findById(menuId)
                .orElseThrow(() -> new ResourseNotFound("Dish not found"));
        mRepository.delete(menu);
    }

    // -------------------- GET MENU LIST --------------------
    @Override
    public List<Menu> getMenuByRestaurant(Integer restaurantId) {
        return mRepository.findByRestaurantId(restaurantId);
    }
}