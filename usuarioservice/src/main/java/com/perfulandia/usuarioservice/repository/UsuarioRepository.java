package com.perfulandia.usuarioservice.repository;

import com.perfulandia.usuarioservice.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


//Importe sus métodos para trabajar en un CRUD
//findAll()bo listar
//findById(Id)
//save() guardar
//delete
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
