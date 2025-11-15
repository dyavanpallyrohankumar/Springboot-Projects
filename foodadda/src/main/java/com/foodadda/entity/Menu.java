package com.foodadda.entity;

import com.foodadda.enums.*;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "menus")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    @Enumerated(EnumType.STRING)
    private DishType type; // VEG, NON_VEG, EGGETARIAN, JAIN
    private String description;
    @Enumerated(EnumType.STRING)
    private CusineType cuisine;
    private double price;
    private double rating;
    private String imageUrl;
    private String specialty;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    public Menu(String name, DishType type, String description, CusineType cuisine, double price, double rating,
            String imageUrl, String specialty, Restaurant restaurant) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.cuisine = cuisine;
        this.price = price;
        this.rating = rating;
        this.imageUrl = imageUrl;
        this.specialty = specialty;
        this.restaurant = restaurant;
    }

}
