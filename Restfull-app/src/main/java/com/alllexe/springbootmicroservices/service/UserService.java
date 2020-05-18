package com.alllexe.springbootmicroservices.service;

import com.alllexe.springbootmicroservices.dto.CreateUserDto;
import com.alllexe.springbootmicroservices.dto.UpdateUserDto;
import com.alllexe.springbootmicroservices.model.User;

public interface UserService {

    User createUser(CreateUserDto createUserDto);

    User getUser(String userId);

    User updateUser(String userId, UpdateUserDto updateUserDto);

    User deleteUser(String userId);

}
