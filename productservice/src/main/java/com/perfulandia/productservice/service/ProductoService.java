package com.perfulandia.productservice.service;

import com.perfulandia.productservice.model.Producto;
import com.perfulandia.productservice.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repo;
    //Contructor
    public ProductoService(ProductoRepository repo){
        this.repo = repo;
    }

    public List<Producto> listar() {
        return repo.findAll();
    }

    public Producto guardar(Producto producto){
        return repo.save(producto);
    }

    public Producto buscar(Long id){
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Long id){
        repo.deleteById(id);
    }



}
