package com.example.demo.crud.adapter.in.controller;


import com.example.demo.crud.application.services.UserService;
import com.example.demo.crud.common.WebAdapter;
import com.example.demo.crud.domain.model.User;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//TODO duda para que usar este alias de @Componet
@WebAdapter

@RestController
@RequestMapping("/user")
@Tag(name = "1. user", description = "controlador crud de usuarios")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("usuario")
    public User getUser() {
        return userService.getUser();
    }

    @GetMapping("usuarios")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
