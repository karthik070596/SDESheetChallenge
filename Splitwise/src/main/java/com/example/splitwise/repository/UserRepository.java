package com.example.splitwise.repository;


import com.example.splitwise.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
    Users save(Users user);
    Optional<Users> findById(Long userid);
}
