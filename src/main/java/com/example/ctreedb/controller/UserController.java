package com.example.ctreedb.controller;

import com.example.ctreedb.model.UserModel;
import com.example.ctreedb.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{userId}")
    public ResponseEntity<UserModel> getUserById(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.findById(userId));
    }

    @PostMapping("save")
    public ResponseEntity<UserModel> save(@RequestBody UserModel userModel) {
        return ResponseEntity.ok(userService.save(userModel));
    }
}
