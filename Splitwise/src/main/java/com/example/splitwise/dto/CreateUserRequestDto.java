package com.example.splitwise.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequestDto {
    private String name;
    private String phonenumber;
    private String password;
}
