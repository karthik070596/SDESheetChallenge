package com.example.splitwise.services;

import com.example.splitwise.models.Users;
import com.example.splitwise.repository.UserRepository;
import com.example.splitwise.services.password.PasswordStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private PasswordStrategy passwordStrategy;
    @Autowired
    public UserService(UserRepository userRepository, PasswordStrategy passwordStrategy)
    {
        this.userRepository=userRepository;
        this.passwordStrategy=passwordStrategy;
    }
    public Users createUser(String name, String phonenumber, String password)
    {
        Users user=new Users();
        user.setName(name);
        user.setPhonenumber(phonenumber);
        user.setPassword(passwordStrategy.getHashedPassword(password));
        Users createdUser=this.userRepository.save(user);
        return createdUser;
    }
    public void authenticateUser(Long id,String password)
    {
        Users user=this.userRepository.findById(id).get();
        String hashedPassword=user.getPassword();
        if(!passwordStrategy.matchPassword(password,hashedPassword))
            throw new RuntimeException("Passwords mismatch");
        System.out.println("Login successful");
    }
}
