package com.example.ctreedb.service.impl;

import com.example.ctreedb.entity.UserEntity;
import com.example.ctreedb.mapper.Mapper;
import com.example.ctreedb.model.UserModel;
import com.example.ctreedb.repository.UserRepository;
import com.example.ctreedb.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final Mapper<UserEntity, UserModel> userMapper;
    private final UserRepository userRepository;

    public UserServiceImpl(Mapper<UserEntity, UserModel> userMapper,
                           UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserModel save(UserModel userModel) {
        return userMapper.toModel(
                userRepository.save(userMapper.toEntity(userModel))
        );
    }

    @Override
    public UserModel findById(Long userId) {
        return userMapper.toModel(userRepository.getOne(userId));
    }
}
