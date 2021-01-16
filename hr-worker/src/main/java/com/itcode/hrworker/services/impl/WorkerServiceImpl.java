package com.itcode.hrworker.services.impl;

import com.itcode.hrworker.domain.entities.Worker;
import com.itcode.hrworker.domain.repositories.WorkerRepository;
import com.itcode.hrworker.services.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerService {

    private final WorkerRepository repo;

    @Override
    public List<Worker> findAll(Worker worke) {
        return repo.findAll();
    }

    @Override
    public Optional<Worker> findById(Long id) {
        return repo.findById(id);
    }
}
