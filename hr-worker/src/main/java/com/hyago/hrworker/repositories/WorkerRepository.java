package com.hyago.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyago.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
