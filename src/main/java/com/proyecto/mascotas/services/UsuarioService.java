package com.proyecto.mascotas.services;

import java.util.List;

import com.proyecto.mascotas.entidades.Usuario;



public interface UsuarioService {

    public List<Usuario> lUsuarios();

    public Usuario guardarUsuario(Usuario usuario);

    public Usuario login(String correo, String password);

    public void eliminarUsuario(Long id);

    


}
