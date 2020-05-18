/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 15.05.2020
 */
package com.alllexe.springbootmicroservices.utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserUtils {

    public String generateUserId() {
        return UUID.randomUUID().toString();
    }
}
