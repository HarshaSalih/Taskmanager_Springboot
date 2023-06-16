package com.example.TaskManager_Backend;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.example.TaskManager_Backend.model.dao.Patients;
import com.example.TaskManager_Backend.repository.PatientRepository;

import com.example.TaskManager_Backend.serviceimplementation.PatientServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
public class PatientServiceImplTest {


        @Mock
        private PatientRepository patientRepository;

        @InjectMocks
        private PatientServiceImpl patientService;

        @BeforeEach
        public void init() {
            MockitoAnnotations.initMocks(this);
        }

        @Test
        public void testGetUserByEmail() {
            String email = "test@example.com";
            Patients patient = new Patients();
            patient.setEmail(email);
            when(patientRepository.findByEmail(email)).thenReturn(patient);

            Patients result = patientService.getUserByEmail(email);
            assertEquals(email, result.getEmail());
        }
    }


