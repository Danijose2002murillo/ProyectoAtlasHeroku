package com.example.proyectoatlasheroku.controller;


import com.example.proyectoatlasheroku.model.Productos;
import com.example.proyectoatlasheroku.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductosController {
    @Autowired
    ProductoServiceImpl personaImpl;

    @PostMapping("/save")
    public ResponseEntity<Productos> save(@RequestBody Productos persona) {
        return new ResponseEntity<>(personaImpl.save(persona), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Productos>> read() {
        return new ResponseEntity<>(personaImpl.findByAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        personaImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/search/{id}")
    public ResponseEntity<Productos> search(@PathVariable Long id) {
        return new ResponseEntity<>(personaImpl.findById(id), HttpStatus.OK);
    }
}
