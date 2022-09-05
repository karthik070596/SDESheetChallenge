package com.example.splitwise.services.password;

public interface PasswordStrategy {
    public String getHashedPassword(String input);
    public boolean matchPassword(String realPassword, String hashedPassword);
}
