package com.foodadda.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Pattern(regexp = "^[a-zA-Z0-9_]{3,20}$", message = "Username must be 3-20 characters String and contain only letters, numbers, or underscores")
    private String userName;

    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Contact number must be a valid 10-digit number")
    @Column(name = "contact_number", length = 10)
    private String contactNumber;

    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message = "Invalid email format")
    private String email;

    // @Pattern(regexp =
    // "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-!@#$%^&*]).{7,20}$", message =
    // "Password must contain uppercase, lowercase, digit, and special character")
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;

    public User(
            @Pattern(regexp = "^[a-zA-Z0-9_]{3,20}$", message = "Username must be 3-20 characters String and contain only letters, numbers, or underscores") String userName,
            @Pattern(regexp = "^[6-9]\\d{9}$", message = "Contact number must be a valid 10-digit number") String contactNumber,
            @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message = "Invalid email format") String email,
            String password,
            UserRole userRole, Address address) {
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
        this.address = address;
    }

}
