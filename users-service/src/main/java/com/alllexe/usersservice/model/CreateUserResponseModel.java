/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 19.05.2020
 */
package com.alllexe.usersservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CreateUserResponseModel {
    private String firstName;
    private String lastName;
    private String email;
    private String userId;
}
