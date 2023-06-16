package com.example.TaskManager_Backend.serviceimplementation;
import com.example.TaskManager_Backend.model.dao.Patients;
import com.example.TaskManager_Backend.model.dto.PatientDto;
import com.example.TaskManager_Backend.repository.PatientRepository;
import com.example.TaskManager_Backend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Override
    public Patients getUserByEmail(String email) {
        return patientRepository.findByEmail(email);
    }

}
