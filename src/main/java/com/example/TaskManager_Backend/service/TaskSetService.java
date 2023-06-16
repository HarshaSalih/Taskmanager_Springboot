package com.example.TaskManager_Backend.service;

import com.example.TaskManager_Backend.model.dao.TaskSet;
import com.example.TaskManager_Backend.model.dto.TaskSetDto;

import java.util.List;

public interface TaskSetService {
    public List<TaskSet> getTaskSetNames();
}
