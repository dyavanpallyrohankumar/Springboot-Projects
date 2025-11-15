package com.foodadda.entity;

import com.foodadda.enums.CusineType;
import com.foodadda.enums.RestaurantStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    Integer id;

    String name;

    String contactNumber;

    @OneToOne
    @JoinColumn(name = "address_id")
    Address address;

    double rating = 2.5;

    @Enumerated(EnumType.STRING)
    RestaurantStatus status;

    @Enumerated(EnumType.STRING)
    CusineType cusineType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User Vendor;

    public Restaurant(String name, String contactNumber, Double rating,
            CusineType cusineType) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.rating = rating;
        this.status = RestaurantStatus.PENDING;
        this.cusineType = cusineType;

    }

}
