package com.example.proyectoatlasheroku.repository;

import com.example.proyectoatlasheroku.model.Productos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductosRepository extends MongoRepository<Productos, Long> {
}
