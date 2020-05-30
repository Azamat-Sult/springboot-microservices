/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 19.05.2020
 */
package com.alllexe.usersservice.repository;

import com.alllexe.usersservice.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);
}
