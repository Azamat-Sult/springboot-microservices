/*
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 18.05.2020
 */
package com.alllexe.accountmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/status/check")
    public String status() {
        return "working";
    }

}
