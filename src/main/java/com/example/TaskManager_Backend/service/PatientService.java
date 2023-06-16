package com.example.TaskManager_Backend.service;

import com.example.TaskManager_Backend.model.dao.Patients;
import com.example.TaskManager_Backend.model.dto.PatientDto;

public interface PatientService {
    Patients getUserByEmail(String email);


}


