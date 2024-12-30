package com.medical.medical_service.service;

import com.medical.medical_service.model.entity.Users;
import com.medical.medical_service.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // register
    public Users registerUser(@RequestBody Users users){
        return userRepository.save(users);
    }

   // users
    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }

    // single user
    public Users getUserById(int id){
        return userRepository.findById(id).get();
    }



}
