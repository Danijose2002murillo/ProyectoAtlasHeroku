package com.example.proyectoatlasheroku.service;

import com.example.proyectoatlasheroku.model.Productos;
import com.example.proyectoatlasheroku.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Productos,Long> implements ProductoService{
    @Autowired
    ProductosRepository productosRepository;

    @Override
    public CrudRepository<Productos, Long> getDao() {
        return productosRepository;
    }

    @Override
    public Productos findById(Long aLong) {
        return null;
    }
}

