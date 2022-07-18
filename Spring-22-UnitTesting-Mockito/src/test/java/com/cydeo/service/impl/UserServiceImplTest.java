package com.cydeo.service.impl;

import com.cydeo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks // injects all the mocks
    UserServiceImpl userService;

    @Test
    void deleteByUsername_test(){
        userService.deleteByUserName("mikesmith@cydeo.com");

        // verify -> make sure that userRepository deleteByUserName by mikesmith@cydeo.com run
//        verify(userRepository).deleteByUserName("mikesmith@cydeo.com");

        // run method 2 times
//        verify(userRepository,times(2)).deleteByUserName("mikesmith@cydeo.com");

        // run at least one time
//        verify(userRepository,atLeastOnce()).deleteByUserName("mikesmith@cydeo.com");
//        verify(userRepository,atMostOnce()).deleteByUserName("mikesmith@cydeo.com");

//        verify(userRepository,atLeast(5)).deleteByUserName("mikesmith@cydeo.com");
//        verify(userRepository,atMost(5)).deleteByUserName("mikesmith@cydeo.com");

        // for order methods
        InOrder inOrder = inOrder(userRepository);

//        inOrder.verify(userRepository).findAll();
        inOrder.verify(userRepository).deleteByUserName("mikesmith@cydeo.com");
        inOrder.verify(userRepository).findAll();
    }
}