package com.example.bookmyshow.repository;

import com.example.bookmyshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShowRepository extends JpaRepository<Show,Long> {
    Show save(Show show);
    Optional<Show> findById(Long id);
}
