package com.example.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;
import com.example.bookmyshow.models.User;

@Getter
@Setter
public class CreateUserResponseDto {
    private User user;
}
