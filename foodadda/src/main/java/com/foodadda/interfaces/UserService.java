package com.foodadda.interfaces;

import java.util.List;
import com.foodadda.entity.User;
import com.foodadda.exception.AlreadyExist;
import com.foodadda.exception.InvalidCredintials;

public interface UserService {

    public User registerUser(User user) throws AlreadyExist;

    public List<User> getAllUsers();

    public String loginUser(String contactNumber, String password) throws InvalidCredintials;

    public String logoutUser();
}