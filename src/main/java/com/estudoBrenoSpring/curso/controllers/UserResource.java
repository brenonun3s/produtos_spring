package com.estudoBrenoSpring.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.estudoBrenoSpring.curso.entities.User;
import com.estudoBrenoSpring.curso.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/users")
@Tag(name = "Usuários", description = "Endpoints para operações com usuários")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    @Operation(summary = "Buscar todos os usuários", description = "Retorna uma lista com todos os usuários cadastrados.")
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Buscar usuário por ID", description = "Retorna os dados de um usuário específico pelo ID.")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
