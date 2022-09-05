package com.example.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter

@Entity
public class Users extends BaseModel{
    private String name;
    private String phonenumber;
    private String password;
}
