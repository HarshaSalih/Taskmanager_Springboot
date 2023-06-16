package com.example.TaskManager_Backend.model.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "patient")

public class Patients {

    @Id
    @GeneratedValue

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