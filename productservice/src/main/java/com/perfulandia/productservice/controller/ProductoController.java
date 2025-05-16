package com.perfulandia.productservice.controller;

import com.perfulandia.productservice.model.Producto;
import com.perfulandia.productservice.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService service;
    // Constructor
    public ProductoController(ProductoService service){
        this.service = service;
    }

    //Listar
    @GetMapping
    public List<Producto> listar(){
        return service.listar();
    }

    //POST
    @PostMapping
    public Producto guardar(@RequestBody Producto producto){
        return service.guardar(producto);
    }

    //id
    @GetMapping("/{id}")
    public Producto buscar(@PathVariable long id){
        return service.buscar(id);
    }

    //Delete
    @DeleteMapping("/{id}")
    public void eliminar(@ PathVariable long id){
        service.eliminar(id);
    }



}
