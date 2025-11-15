package com.foodadda.interfaces;

import java.util.List;

import com.foodadda.entity.Menu;
import com.foodadda.exception.ResourseNotFound;

public interface MenuService {
    public Menu addDish(Integer restaurantId, Menu menu) throws ResourseNotFound;

    public Menu updateDish(Integer menuId, Menu updated) throws ResourseNotFound;

    public void deleteDish(Integer menuId) throws ResourseNotFound;

    public List<Menu> getMenuByRestaurant(Integer restaurantId);

}
