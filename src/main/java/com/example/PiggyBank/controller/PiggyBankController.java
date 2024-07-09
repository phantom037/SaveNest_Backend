package com.example.PiggyBank.controller;

import com.example.PiggyBank.entity.UserDTO;
import com.example.PiggyBank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/piggybank")
public class PiggyBankController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDTO> getAllUser() throws ExecutionException, InterruptedException {
        List<UserDTO> allUsers = userService.getUserList();
        System.out.println(allUsers.size());
        return allUsers;
    }
}

