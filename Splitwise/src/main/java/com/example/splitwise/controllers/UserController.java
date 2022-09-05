package com.example.splitwise.controllers;

import com.example.splitwise.dto.CreateUserRequestDto;
import com.example.splitwise.dto.CreateUserResponseDto;
import com.example.splitwise.models.Users;
import com.example.splitwise.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
//    @PostMapping("api/createUser")
    public Users createUser(CreateUserRequestDto createUserRequestDto)
    {
        Users createdUser=this.userService.createUser(createUserRequestDto.getName(),createUserRequestDto.getPhonenumber(),createUserRequestDto.getPassword());
        return createdUser;
    }
    public void authenticateUser(long userid,String password)
    {
        this.userService.authenticateUser(userid,password);
    }
}
