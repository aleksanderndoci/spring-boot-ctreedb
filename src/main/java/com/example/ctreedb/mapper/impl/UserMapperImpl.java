package com.example.ctreedb.mapper.impl;

import com.example.ctreedb.entity.UserEntity;
import com.example.ctreedb.mapper.Mapper;
import com.example.ctreedb.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements Mapper<UserEntity, UserModel> {
    @Override
    public UserEntity toEntity(UserModel model) {
        UserEntity entity = new UserEntity();
        entity.setUserId(model.getUserId());
        entity.setName(model.getName());
        return entity;
    }

    @Override
    public UserModel toModel(UserEntity entity) {
        UserModel model = new UserModel();
        model.setUserId(entity.getUserId());
        model.setName(entity.getName());
        return model;
    }
}
