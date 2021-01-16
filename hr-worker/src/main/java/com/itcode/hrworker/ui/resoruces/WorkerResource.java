package com.itcode.hrworker.ui.resoruces;

import com.itcode.hrworker.domain.entities.Worker;
import com.itcode.hrworker.services.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/workers")
public class WorkerResource {

    private final WorkerService srv;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(Worker worker){
        List<Worker> wr = srv.findAll(worker);
        return ResponseEntity.ok().body(wr);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Worker>> findById(@PathVariable("id") Long id){
        Optional<Worker> wr = srv.findById(id);
        return ResponseEntity.ok().body(wr);
    }

}
