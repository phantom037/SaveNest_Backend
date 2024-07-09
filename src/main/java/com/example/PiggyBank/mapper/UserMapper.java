package com.example.PiggyBank.mapper;


import com.example.PiggyBank.entity.UserDTO;
import com.example.PiggyBank.entity.User;

public class UserMapper {
    public static User mapToUser(UserDTO userDTO){
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getPhotoUrl(), userDTO.getUsername(),
                userDTO.getBalance(), userDTO.getToken(), userDTO.getTransactionList(),
                userDTO.getCreatedAt(), userDTO.getDob());
    }

    public static UserDTO mapToUserDTO(User user){
        return new UserDTO(user.getId(), user.getName(), user.getPhotoUrl(), user.getUsername(),
                user.getBalance(), user.getToken(), user.getTransactionList(),
                user.getCreatedAt(), user.getDob());
    }
}

