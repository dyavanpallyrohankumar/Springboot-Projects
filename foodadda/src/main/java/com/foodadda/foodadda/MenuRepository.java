package com.foodadda.foodadda;

import java.util.List;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MenuRepository {

    @PersistenceContext
    EntityManager manager;

    public String addItem(Menu menu) {
        manager.persist(menu);
        return menu.getItemName() + " is saved";
    }

    public Menu getItem(Integer id) {
        return manager.find(Menu.class, id);
    }

    public Menu updateItem(Menu menu, Integer id) {
        manager.merge(menu);
        return menu;
    }

    public void deleteItem(Integer id) {
        Menu menu = getItem(id);
        if (menu != null) {
            manager.remove(menu);
        }
    }

    public List<Menu> getallItems() {
        String jpql = "select m from Menu m";
        return manager.createQuery(jpql, Menu.class).getResultList();
    }

    // JPQL: Filter by category
    public List<Menu> getItemsByCategory(String category) {
        String jpql = "SELECT m FROM Menu m WHERE m.category = :category";
        return manager.createQuery(jpql, Menu.class)
                .setParameter("category", category)
                .getResultList();
    }

    // JPQL: Order by price
    public List<Menu> getItemsOrderedByPrice() {
        String jpql = "SELECT m FROM Menu m ORDER BY m.price ASC";
        return manager.createQuery(jpql, Menu.class).getResultList();
    }

    // JPQL: Group by category with average price
    public List<Object[]> getAveragePriceByCategory() {
        String jpql = "SELECT m.category, AVG(m.price) FROM Menu m GROUP BY m.category";
        return manager.createQuery(jpql, Object[].class).getResultList();
    }

}
