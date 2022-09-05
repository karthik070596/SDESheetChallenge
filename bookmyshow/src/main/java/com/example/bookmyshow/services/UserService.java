package com.example.bookmyshow.services;

import com.example.bookmyshow.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookmyshow.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    public User createUser(String email)
    {
        User user=new User();
        user.setEmail(email);
        User createdUser=userRepository.save(user);
        return createdUser;
    }

}
