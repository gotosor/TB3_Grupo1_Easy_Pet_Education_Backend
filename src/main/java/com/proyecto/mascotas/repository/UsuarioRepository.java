package com.proyecto.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.mascotas.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
   
   
    public Usuario findByCorreo(String correo);
    public Usuario findByCorreoAndPassword(String correo, String password);
}
