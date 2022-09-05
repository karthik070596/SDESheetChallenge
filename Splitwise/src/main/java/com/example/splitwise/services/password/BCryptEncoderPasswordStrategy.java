package com.example.splitwise.services.password;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BCryptEncoderPasswordStrategy implements PasswordStrategy{
    private BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
    @Override
    public String getHashedPassword(String input) {
        return passwordEncoder.encode(input);
    }

    @Override
    public boolean matchPassword(String realPassword, String hashedPassword) {
        return passwordEncoder.matches(realPassword,hashedPassword);
    }
}
