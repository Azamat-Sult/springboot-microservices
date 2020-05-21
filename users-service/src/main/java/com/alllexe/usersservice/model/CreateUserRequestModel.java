/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 19.05.2020
 */
package com.alllexe.usersservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateUserRequestModel {
    @NotNull(message = "First name cannot be null")
    @Size(min = 2, message = "First name min 2 characters")
    private String firstName;
    @NotNull(message = "Last name cannot be null")
    @Size(min = 2, message = "Last name min 2 characters")
    private String lastName;
    @NotNull(message = "Password name cannot be null")
    @Size(min = 8, max = 16,  message = "Password name min 8 characters, max 16")
    private String password;
    @NotNull(message = "Email name cannot be null")
    @Email
    private String email;
}
