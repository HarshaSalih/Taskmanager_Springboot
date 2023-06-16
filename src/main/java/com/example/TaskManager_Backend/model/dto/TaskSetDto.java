package com.example.TaskManager_Backend.model.dto;

import com.example.TaskManager_Backend.model.dao.TaskSet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskSetDto {

    private List<TaskSet> taskSetsList;
}
