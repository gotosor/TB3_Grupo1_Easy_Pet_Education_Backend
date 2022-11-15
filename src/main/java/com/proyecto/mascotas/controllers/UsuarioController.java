package com.proyecto.mascotas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.mascotas.entidades.Usuario;
import com.proyecto.mascotas.services.UsuarioService;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;

    @PostMapping()
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {

        return usuarioService.guardarUsuario(usuario);

    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario) {

        return usuarioService.login(usuario.getCorreo(), usuario.getPassword());

    }

    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioId) {
        usuarioService.eliminarUsuario(usuarioId);
    }

}
