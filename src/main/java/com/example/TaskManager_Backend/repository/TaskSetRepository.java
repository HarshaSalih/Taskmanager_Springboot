package com.example.TaskManager_Backend.repository;

import com.example.TaskManager_Backend.model.dao.TaskSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskSetRepository extends JpaRepository<TaskSet,Integer> {
}
