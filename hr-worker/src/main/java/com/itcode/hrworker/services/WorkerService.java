package com.itcode.hrworker.services;

import com.itcode.hrworker.domain.entities.Worker;

import java.util.List;
import java.util.Optional;

public interface WorkerService {

    List<Worker> findAll(Worker worke);
    Optional<Worker> findById(Long id);

}
