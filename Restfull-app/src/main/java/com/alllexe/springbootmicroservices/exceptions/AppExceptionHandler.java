/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 15.05.2020
 */
package com.alllexe.springbootmicroservices.exceptions;

import com.alllexe.springbootmicroservices.dto.ErrorMessageDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<?> handleAnyException(Exception ex, WebRequest webRequest) {
        ErrorMessageDto errorMessageDto = ErrorMessageDto.builder()
                .message(ex.getLocalizedMessage() == null ? ex.toString() : ex.getLocalizedMessage())
                .localDateTime(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorMessageDto, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = {UserServiceException.class})
    public ResponseEntity<?> handleUserServiceException(UserServiceException ex, WebRequest webRequest) {
        ErrorMessageDto errorMessageDto = ErrorMessageDto.builder()
                .message(ex.getLocalizedMessage() == null ? ex.toString() : ex.getLocalizedMessage())
                .localDateTime(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorMessageDto, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
