package com.oni.bookkeeping.controller;

import com.oni.bookkeeping.entity.User;
import com.oni.bookkeeping.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200",
        "http://192.168.1.100:4200"})
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
