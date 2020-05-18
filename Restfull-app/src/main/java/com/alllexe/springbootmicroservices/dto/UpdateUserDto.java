/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 15.05.2020
 */
package com.alllexe.springbootmicroservices.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UpdateUserDto {
    @NotNull(message = "First name cannot be null")
    @Size(min = 2, message = "First name cannot be less then 2 charcters")
    private String firstName;

    @NotNull(message = "Last name cannot be null")
    @Size(min = 2, message = "Last name cannot be less then 2 charcters")
    private String lastName;

}
