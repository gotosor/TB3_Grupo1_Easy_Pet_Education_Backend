package com.proyecto.mascotas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.mascotas.entidades.Usuario;
import com.proyecto.mascotas.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        Usuario usuariolocal = usuarioRepository.findByCorreo(usuario.getCorreo());
        if( usuariolocal != null){
            System.out.println("El usuario ya existe");
        }else{
            usuariolocal = usuarioRepository.save(usuario);

        }
        return usuariolocal;
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
        
    }

    @Override
    public Usuario login(String correo, String password) {
        return usuarioRepository.findByCorreoAndPassword(correo, password);
    }

    @Override
    public List<Usuario> lUsuarios() {
    
        return usuarioRepository.findAll();
    }

    
}
