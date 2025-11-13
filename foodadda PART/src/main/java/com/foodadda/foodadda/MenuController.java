package com.foodadda.foodadda;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuServiceImpl menuService;

    @GetMapping("/")
    public String allpaths() {
        return "for add: /add\nfor getitem /{id}\nfor update /update \nfor delete /delete/{id}\nfor allitems /all\nfor catogory /category/{category}\\n"
                + //
                "\r\n" + //
                "for ordering /orderByPrice\\n" + //
                "\r\n" + //
                "for orderby catagory /avgPriceByCategory\\n" + //
                "";
    }

    @PostMapping("/add")
    public String addItem(@RequestBody Menu menu) {
        menuService.addItem(menu);
        return "Item added successfully!";
    }

    @GetMapping("/{id}")
    public Menu getItem(@PathVariable Integer id) {
        return menuService.getItem(id);
    }

    @PutMapping("/update")
    public Menu updateItem(@PathVariable Integer id, @RequestBody Menu menu) {
        return menuService.updateItem(menu, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable Integer id) {
        menuService.deleteItem(id);
        return "Item deleted successfully!";
    }

    @GetMapping("/all")
    public List<Menu> getAllItems() {
        return menuService.getAllItems();
    }

    @GetMapping("/category/{category}")
    public List<Menu> getByCategory(@PathVariable String category) {
        return menuService.getItemsByCategory(category);
    }

    @GetMapping("/orderByPrice")
    public List<Menu> getItemsOrderedByPrice() {
        return menuService.getItemsOrderedByPrice();
    }

    @GetMapping("/avgPriceByCategory")
    public List<Object[]> getAveragePriceByCategory() {
        return menuService.getAveragePriceByCategory();
    }
}
