
package com.foodadda.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @NotNull(message = "Enter the address")
    @NotBlank(message = "address should not be blank")
    private String addressName;

    @NotNull(message = "Enter the line1")
    @NotBlank(message = "line1 should not be blank")
    private String line1;

    @NotNull(message = "Enter the line2")
    @NotBlank(message = "line2 should not be blank")
    private String line2;

    @NotNull(message = "Enter the city")
    @NotBlank(message = "city should not be blank")
    @Pattern(regexp = "^[A-Za-z ]{2,50}$", message = "City must contain only letters and spaces,2–50 characters")
    private String city;

    @NotNull(message = "Enter the state")
    @NotBlank(message = "state should not be blank")
    @Pattern(regexp = "^[A-Za-z ]{2,50}$", message = "State must contain onlyletters and spaces,2–50 characters")
    private String state;

    @NotNull(message = "Enter the pincode")
    @NotBlank(message = "pincode should not be blank")
    // @Pattern(regexp = "^[1-9][0-9]{6}$", message = "Pincode must be a
    // 6-digitnumber starting from 1–9")
    private String pincode;

    public Address(
            @NotNull(message = "Enter the address") @NotBlank(message = "address should not be blank") String addressName,
            @NotNull(message = "Enter the line1") @NotBlank(message = "line1 should notbe blank") String line1,
            @NotNull(message = "Enter the line2") @NotBlank(message = "line2 should notbe blank") String line2,
            @NotNull(message = "Enter the city") @NotBlank(message = "city should not beblank") @Pattern(regexp = "^[A-Za-z ]{2,50}$", message = "City must containonly letters and spaces, 2–50 characters") String city,
            @NotNull(message = "Enter the state") @NotBlank(message = "state should notbe blank") @Pattern(regexp = "^[A-Za-z ]{2,50}$", message = "State mustcontain only letters and spaces, 2–50 characters") String state,
            String pincode) {
        this.addressName = addressName;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address [id=" + id + ", addressName=" + addressName + ", line1=" +
                line1 + ", line2=" + line2
                + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
    }

}

// import jakarta.persistence.*;

// @Entity
// public class Address {

// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Long id;

// private String street;
// private String city;
// private String state;
// private String zip;

// public Address(String street, String city, String state, String zip) {
// this.street = street;
// this.city = city;
// this.state = state;
// this.zip = zip;
// }

// public Long getId() {
// return id;
// }

// public void setId(Long id) {
// this.id = id;
// }

// public String getStreet() {
// return street;
// }

// public void setStreet(String street) {
// this.street = street;
// }

// public String getCity() {
// return city;
// }

// public void setCity(String city) {
// this.city = city;
// }

// public String getState() {
// return state;
// }

// public void setState(String state) {
// this.state = state;
// }

// public String getZip() {
// return zip;
// }

// public void setZip(String zip) {
// this.zip = zip;
// }

// // Getters and Setters
// }

//
