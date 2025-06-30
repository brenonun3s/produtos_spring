package com.estudoBrenoSpring.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.estudoBrenoSpring.curso.entities.Order;
import com.estudoBrenoSpring.curso.service.OrderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/orders")
@Tag(name = "Pedidos", description = "Endpoints para operações com pedidos")
public class OrderResource {

    @Autowired
    private OrderService service;

    @GetMapping
    @Operation(summary = "Buscar todos os pedidos", description = "Retorna uma lista com todos os pedidos cadastrados.")
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Buscar pedido por ID", description = "Retorna os dados de um pedido específico pelo ID.")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
