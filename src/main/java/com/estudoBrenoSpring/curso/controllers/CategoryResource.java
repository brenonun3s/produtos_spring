package com.estudoBrenoSpring.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.estudoBrenoSpring.curso.entities.Category;
import com.estudoBrenoSpring.curso.service.CategoryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/categories")
@Tag(name = "Categorias", description = "Endpoints para operações com categorias")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    @Operation(summary = "Buscar todas as categorias", description = "Retorna uma lista com todas as categorias cadastradas.")
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = categoryService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Buscar categoria por ID", description = "Retorna os dados de uma categoria específica pelo ID.")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = categoryService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
