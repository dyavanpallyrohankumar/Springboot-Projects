package com.foodadda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.foodadda.entity.*;
import com.foodadda.exception.*;
import com.foodadda.interfaces.UserService;
import com.foodadda.repository.*;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository uRepository;

    @Autowired
    AddressRepository aRepository;

    @Override
    public User registerUser(User user) throws AlreadyExist {
        Optional<User> existingUser = uRepository.findByContactNumber(user.getContactNumber());
        if (existingUser.isPresent() && existingUser.get().getUserRole() == user.getUserRole()) {
            throw new AlreadyExist("User Already Exist with same role");
        }
        Address address = aRepository.save(user.getAddress());
        user.setAddress(address);
        return uRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return uRepository.findAll();
    }

    @Override
    public String loginUser(String contactNumber, String password) throws InvalidCredintials {
        Optional<User> user = uRepository.findByContactNumber(contactNumber);
        if (user.isPresent() && password.equals(user.get().getPassword()))
            return "Successfully Loggged into FoodADDA Welcome " + user.get().getUserName();
        throw new InvalidCredintials("Please Enter Proper Credentials");
    }

    @Override
    public String logoutUser() {
        return "You have been Logged out Sucessfully";
    }
}
