/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 21.05.2020
 */
package com.alllexe.usersservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginRequestModel {
    private String email;
    private String password;
}
