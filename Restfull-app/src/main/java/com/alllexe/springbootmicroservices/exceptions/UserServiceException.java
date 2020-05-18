/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 15.05.2020
 */
package com.alllexe.springbootmicroservices.exceptions;

public class UserServiceException extends RuntimeException {

    public UserServiceException(String message) {
        super(message);
    }
}
