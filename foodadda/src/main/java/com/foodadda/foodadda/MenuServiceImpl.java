package com.foodadda.foodadda;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl {

   @Autowired
   private MenuRepository menuRepository;

   public void addItem(Menu menu) {
      menuRepository.addItem(menu);
   }

   public Menu getItem(Integer id) {
      return menuRepository.getItem(id);
   }

   public Menu updateItem(Menu menu, Integer id) {
      return menuRepository.updateItem(menu, id);
   }

   public void deleteItem(Integer id) {
      menuRepository.deleteItem(id);
   }

   public List<Menu> getAllItems() {
      return menuRepository.getallItems();
   }

   public List<Menu> getItemsByCategory(String category) {
      return menuRepository.getItemsByCategory(category);
   }

   public List<Menu> getItemsOrderedByPrice() {
      return menuRepository.getItemsOrderedByPrice();
   }

   public List<Object[]> getAveragePriceByCategory() {
      return menuRepository.getAveragePriceByCategory();
   }
}