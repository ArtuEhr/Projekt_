package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/punkty")
public class PunktyController {

    @RequestMapping("/users")
    List<String> getUsers(){
        return Arrays.asList("Student1", "Student2", "Student3");
    }
}
