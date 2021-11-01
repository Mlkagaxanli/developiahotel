package com.developia.developiahotel.service;

import com.developia.developiahotel.dao.entity.UserEntity;
import com.developia.developiahotel.dao.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;


    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public UserEntity getUserById(Long id) {
        Optional<UserEntity> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(new UserEntity());
    }
}
