package com.medical.medical_service.controller;


import com.medical.medical_service.model.dtos.UsersDTO;
import com.medical.medical_service.model.entity.Users;
import com.medical.medical_service.model.mapper.UserMapper;
import com.medical.medical_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    // a new user entry
    @PostMapping("/register")
    public UsersDTO register(@RequestBody UsersDTO dto) {
        return userMapper.map(userService.registerUser(userMapper.map(dto)));
    }

    // get all users
    @GetMapping("/users")
    public List<UsersDTO> getAllUsers() {
        return userService.getAllUsers().stream().map(u -> userMapper.map(u)).collect(Collectors.toList());
    }

    //    single user based on id
    @GetMapping("/users/{id}")
    public UsersDTO getUserById(@PathVariable int id) {
        return userMapper.map(userService.getUserById(id));
    }


//    @PostMapping("/login")
//    public User login(@RequestBody User user) {
//        public findUser = userRepository.getUsersBy(user.getName())
//    }

}
