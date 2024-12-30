package com.medical.medical_service.controller;


import com.medical.medical_service.model.Users;
import com.medical.medical_service.repository.UserRepository;
import com.medical.medical_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // a new user entry
    @PostMapping("/register")
    public Users register(@RequestBody Users users) {
        return userService.registerUser(users);
    }

    // get all users
    @GetMapping("/users")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    //    single user based on id
    @GetMapping("/users/{id}")
    public Users getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }


//    @PostMapping("/login")
//    public User login(@RequestBody User user) {
//        public findUser = userRepository.getUsersBy(user.getName())
//    }

}
