package com.example.TaskManager_Backend;


import com.example.TaskManager_Backend.model.dao.Patients;
import com.example.TaskManager_Backend.repository.PatientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PatientRepositoryTests {

    @Autowired
    private PatientRepository patientRepository;


    @Test
    public void testFindByEmail() {
        // Arrange
        String email = "johndoe@example.com";

        Patients expectedPatient = Patients.builder().
                firstName("John")
                .lastName("Doe")
                .mrn(5546546)
                .gender("male")
                .age(25)
                .location("abc hospital")
                .email(email)
                .id(1)
                .status(0).build();

        patientRepository.save(expectedPatient);

//        // Act
        Patients actualPatient = patientRepository.findByEmail(email);
//
//        // Assert
        assertNotNull(actualPatient);
        assertEquals(expectedPatient.getEmail(), actualPatient.getEmail());
        assertEquals(expectedPatient.getFirstName(), actualPatient.getFirstName());
        assertEquals(expectedPatient.getLastName(), actualPatient.getLastName());
        assertEquals(expectedPatient.getGender(), actualPatient.getGender());
        assertEquals(expectedPatient.getAge(), actualPatient.getAge());
    }
}


