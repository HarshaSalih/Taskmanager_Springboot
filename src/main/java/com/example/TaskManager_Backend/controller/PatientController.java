package com.example.TaskManager_Backend.controller;
import com.example.TaskManager_Backend.model.dao.Patients;
import com.example.TaskManager_Backend.model.dao.TaskSet;
import com.example.TaskManager_Backend.model.dto.PatientDto;
import com.example.TaskManager_Backend.model.dto.TaskSetDto;
import com.example.TaskManager_Backend.service.PatientService;
import com.example.TaskManager_Backend.service.TaskSetService;
import com.example.TaskManager_Backend.serviceimplementation.TaskSetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class PatientController {
    @Autowired
    private PatientService patientService;

    @Autowired
    private TaskSetServiceImpl taskSetServiceImpl;

    @CrossOrigin(origins = "*")
    @GetMapping("/viewPatient/{email}")
    public Patients viewPatient(@PathVariable("email") String email) {
        return patientService.getUserByEmail(email);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewTaskSet")
    public TaskSetDto TaskSetView()
    {
        List<TaskSet> taskSets= taskSetServiceImpl.getTaskSetNames();
        TaskSetDto tDto=new TaskSetDto();
        tDto.setTaskSetsList(taskSets);
        return tDto;
    }


}
