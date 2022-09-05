package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dto.CreateUserRequestDto;
import com.example.bookmyshow.dto.CreateUserResponseDto;
import com.example.bookmyshow.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.bookmyshow.services.UserService;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService=userService;
    }
    public CreateUserResponseDto createUser(CreateUserRequestDto request) {
        CreateUserResponseDto createUserResponseDto = new CreateUserResponseDto();
        User createdUser=userService.createUser(request.getEmail());
        createUserResponseDto.setUser(createdUser);
        return createUserResponseDto;
    }

}
