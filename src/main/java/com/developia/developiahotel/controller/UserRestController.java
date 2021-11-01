package com.developia.developiahotel.controller;

import com.developia.developiahotel.dao.entity.UserEntity;
import com.developia.developiahotel.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/rest/users")
@RestController
public class UserRestController {

    private final UserService service;

    public UserRestController(UserService userService){
        this.service = userService;
    }

    @ResponseBody
    @GetMapping("/{id}")
    public UserEntity getUserRest(@PathVariable(name = "id") Long userId){
        return service.getUserById(userId);
    }

    @PostMapping
    public void saveUser(@RequestBody UserEntity user){
        service.saveUser(user);
    }

    @GetMapping
    public List<UserEntity> getUsers(){
        return service.getAllUsers();
    }


}
