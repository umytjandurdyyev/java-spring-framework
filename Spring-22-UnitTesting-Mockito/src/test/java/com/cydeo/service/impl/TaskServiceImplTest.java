package com.cydeo.service.impl;

import com.cydeo.dto.TaskDTO;
import com.cydeo.model.Task;
import com.cydeo.mapper.TaskMapper;
import com.cydeo.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TaskServiceImplTest {

    @Mock
    TaskRepository taskRepository;
    @Mock
    TaskMapper taskMapper;

    @InjectMocks
    TaskServiceImpl taskService;

    @ParameterizedTest
    @ValueSource(longs = {1L,2L,3L, -5L})
    void findById_test(long id){

        // Given
        when(taskRepository.findById(id)).thenReturn(Optional.of(new Task()));
        when(taskMapper.convertToDTO(new Task())).thenReturn(new TaskDTO());

        // When
        taskService.findById(id);

        // Then
        verify(taskRepository).findById(id);
        verify(taskRepository).findById(anyLong());

        verify(taskMapper).convertToDTO(any(Task.class));
        verify(taskMapper).convertToDTO(new Task());

//        verify(taskRepository, never()).findById(-5L); // Never wanted here

    }

    @Test
    void findById_bdd_test(){

        // Given
        given(taskRepository.findById(anyLong())).willReturn(Optional.of(new Task()));
        given(taskMapper.convertToDTO(new Task())).willReturn(new TaskDTO());

        // When
        taskService.findById(anyLong());

        // Then
        then(taskRepository).should().findById(anyLong());
        then(taskRepository).should(never()).findById(-5L);

        then(taskMapper).should().convertToDTO(new Task());

    }
}