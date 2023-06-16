package com.example.TaskManager_Backend.repository;

import com.example.TaskManager_Backend.model.dao.Patients;
import com.example.TaskManager_Backend.model.dto.PatientDto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patients, Integer> {
    Patients findByEmail(String email);


}
