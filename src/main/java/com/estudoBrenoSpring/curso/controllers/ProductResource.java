package com.estudoBrenoSpring.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.estudoBrenoSpring.curso.entities.Product;
import com.estudoBrenoSpring.curso.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/products")
@Tag(name = "Produtos", description = "Endpoints para operações com produtos")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    @Operation(summary = "Buscar todos os produtos", description = "Retorna uma lista com todos os produtos cadastrados.")
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Buscar produto por ID", description = "Retorna os dados de um produto específico pelo ID.")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
