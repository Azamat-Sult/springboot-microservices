/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 15.05.2020
 */
package com.alllexe.springbootmicroservices.service;

import com.alllexe.springbootmicroservices.dto.CreateUserDto;
import com.alllexe.springbootmicroservices.dto.UpdateUserDto;
import com.alllexe.springbootmicroservices.model.User;
import com.alllexe.springbootmicroservices.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserSercieImpl implements UserService {

    private Map<String, User> users = new HashMap<>();
    private UserUtils userUtils;

    @Autowired
    public UserSercieImpl(UserUtils userUtils) {
        this.userUtils = userUtils;
    }

    @Override
    public User getUser(String userId) {
        return users.get(userId);
    }

    @Override
    public User createUser(CreateUserDto userDetails) {
        User user = User.builder()
                .userId(userUtils.generateUserId())
                .firstName(userDetails.getFirstName())
                .lastName(userDetails.getLastName())
                .emailName(userDetails.getEmailName())
                .build();

        users.put(user.getUserId(), user);

        return user;
    }

    @Override
    public User updateUser(String userId, UpdateUserDto userDetails) {
        if (users.containsKey(userId)) {
            User user = users.get(userId);
            user.setFirstName(userDetails.getFirstName());
            user.setLastName(userDetails.getLastName());
            users.put(userId, user);
            return user;
        } else {
            return null;
        }
    }

    @Override
    public User deleteUser(String userId) {
        if (users.containsKey(userId)) {
            User user = users.get(userId);
            users.remove(userId);
            return user;
        } else {
            return null;
        }
    }
}
