/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 18.05.2020
 */
package com.alllexe.usersservice.controller;

import com.alllexe.usersservice.dto.UserDto;
import com.alllexe.usersservice.entity.UserEntity;
import com.alllexe.usersservice.model.CreateUserRequestModel;
import com.alllexe.usersservice.model.CreateUserResponseModel;
import com.alllexe.usersservice.service.UsersService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private Environment env;

    @Autowired
    private UsersService usersService;

    @GetMapping("/status/check")
    public String status() {
        return "working on port " + env.getProperty("local.server.port")
                + ", with token " + env.getProperty("token.secret");
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> createUser(@RequestBody @Valid CreateUserRequestModel userDetails) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto userDto = modelMapper.map(userDetails, UserDto.class);

        UserDto createdUser = usersService.createUser(userDto);
        CreateUserResponseModel userResponseModel = modelMapper.map(createdUser, CreateUserResponseModel.class);

        return new ResponseEntity<>(userResponseModel, HttpStatus.CREATED);
    }
}
