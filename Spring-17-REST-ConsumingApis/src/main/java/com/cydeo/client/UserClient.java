package com.cydeo.client;

import com.cydeo.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "USER-CLIENT")
public interface UserClient {
    // getUsers method is gonna trigger 3rd party end point and execute get method
    @GetMapping("/users")
    List<User> getUsers();
}
