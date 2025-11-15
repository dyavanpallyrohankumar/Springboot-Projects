package com.foodadda.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.foodadda.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    public Optional<Menu> findByNameAndRestaurantId(String name, Integer id);

    public List<Menu> findByRestaurantId(Integer id);

}
