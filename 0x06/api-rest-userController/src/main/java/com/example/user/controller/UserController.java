package com.example.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {
        String msg = "You have entered valid ID";
        if ((id > 0 && id < 100)) {
            return msg;
        }
        throw new NullPointerException();

    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {

        String msg = "You have entered valid USERNAME";
        if ((userName.length() > 3 && userName.length() < 15)) {
            return msg;
        }
        throw new NullPointerException();
    }

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {

        String msg = "You have entered valid CPF";
        if (isCPF(cpf)) {
            return msg;
        }
        throw new NullPointerException();
    }

    public boolean isCPF(String cpf) {

        return cpf.length() > 3 && cpf.length() < 15;
    }

}

