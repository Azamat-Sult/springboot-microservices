/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 13.05.2020
 */
package com.alllexe.springbootmicroservices.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User {

    private String userId;
    private String firstName;
    private String lastName;
    private String emailName;
}
