/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 19.05.2020
 */
package com.alllexe.usersservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDto implements Serializable {

    private static final long serialVersionUID = -3317130394168441238L;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String userId;
    private String encryptedPassword;
}
