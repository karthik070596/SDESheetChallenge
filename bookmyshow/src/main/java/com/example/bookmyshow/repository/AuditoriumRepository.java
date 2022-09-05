package com.example.bookmyshow.repository;

import com.example.bookmyshow.models.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuditoriumRepository extends JpaRepository<Auditorium,Long> {
    Auditorium save(Auditorium auditorium);

    @Override
    Optional<Auditorium> findById(Long id);
}
