package com.developia.developiahotel.service;

import com.developia.developiahotel.dao.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUsers();

    void saveUser(UserEntity user);

    UserEntity getUserById(Long id);
}
