package com.example.PiggyBank.service;

import com.example.PiggyBank.entity.UserDTO;
import com.example.PiggyBank.entity.User;
import com.example.PiggyBank.mapper.UserMapper;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

@Service
public class UserService {
//    @Autowired
//    UserDTO userDTO;

    public List<UserDTO> getUserList() throws ExecutionException, InterruptedException {
        Firestore firestore = FirestoreClient.getFirestore();

        ApiFuture<QuerySnapshot> apiFuture = firestore.collection("user").get();
        List<QueryDocumentSnapshot> list = apiFuture.get().getDocuments();
        List<User> userList = list.stream().map((docs) -> docs.toObject(User.class)).collect(Collectors.toList());
        return userList.stream().map(user -> UserMapper.mapToUserDTO(user)).collect(Collectors.toList());
    }
}

