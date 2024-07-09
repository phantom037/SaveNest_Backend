package com.example.PiggyBank.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String id;
    private String name;
    private String photoUrl;
    private String username;
    private int balance;
    private String token;
    private List<String> transactionList;
    private String createdAt;
    private String dob;
}

