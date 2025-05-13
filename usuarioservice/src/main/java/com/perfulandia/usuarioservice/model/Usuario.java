package com.perfulandia.usuarioservice.model;

import jakarta.persistence.*;
import lombok.*;


// Entidad que se comporta como una tabla
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // Me permite generar constructores flexibles
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
    private String rol; // Varios tipos de roles según perfulandia (Admin, gerente, usuario)

}

