package com.example.TaskManager_Backend.serviceimplementation;

import com.example.TaskManager_Backend.model.dao.TaskSet;
import com.example.TaskManager_Backend.model.dto.TaskSetDto;
import com.example.TaskManager_Backend.repository.TaskSetRepository;
import com.example.TaskManager_Backend.service.TaskSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskSetServiceImpl implements TaskSetService {

    @Autowired
    private TaskSetRepository taskSetRepository;

    @Override
    public List<TaskSet> getTaskSetNames(){

        return taskSetRepository.findAll();
    }
}
