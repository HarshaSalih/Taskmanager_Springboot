package com.example.TaskManager_Backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PatientDto {

    private int id;
    private String firstName;
    private String lastName;
    private long mrn;
    private String gender;
    private int age;
    private Date dob;
    private String location;
    private LocalDateTime last_updated_at;
    private String email;
    private LocalDateTime loggedin_time;
    private int status;
    private String password;

}
