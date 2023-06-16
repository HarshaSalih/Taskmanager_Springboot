package com.example.TaskManager_Backend;

import com.example.TaskManager_Backend.model.dao.TaskSet;
import com.example.TaskManager_Backend.repository.TaskSetRepository;
import com.example.TaskManager_Backend.serviceimplementation.TaskSetServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;



    @SpringBootTest
    public class TaskSetServiceImplTest {

        @Mock
        private TaskSetRepository taskSetRepository;

        @InjectMocks
        private TaskSetServiceImpl taskSetService;

        @Test
        public void testGetTaskSetNames() {
            List<TaskSet> taskSets = new ArrayList<>();
            taskSets.add(new TaskSet(1, "Task Set 1"));
            taskSets.add(new TaskSet(2, "Task Set 2"));

            when(taskSetRepository.findAll()).thenReturn(taskSets);

            List<TaskSet> actualTaskSets = taskSetService.getTaskSetNames();

            assertEquals(taskSets, actualTaskSets);
        }
    }


