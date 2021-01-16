package com.itcode.hrworker.domain.repositories;

import com.itcode.hrworker.domain.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    Optional<Worker> findById(Long id);
}
