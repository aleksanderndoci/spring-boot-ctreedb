package com.example.ctreedb.service;

import com.example.ctreedb.model.UserModel;

public interface UserService {
    UserModel save(UserModel userModel);

    UserModel findById(Long userId);
}
