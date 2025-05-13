package com.perfulandia.usuarioservice.service;

import com.perfulandia.usuarioservice.repository.UsuarioRepository;
import com.perfulandia.usuarioservice.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioService {

    private final UsuarioRepository repo;
    //Constructor para poder inyectar mi interfaz
    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public List<Usuario> listar() {
        return repo.findAll();
    }

    public

}
