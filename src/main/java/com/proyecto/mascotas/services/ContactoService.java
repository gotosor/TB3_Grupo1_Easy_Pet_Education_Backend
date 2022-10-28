package com.proyecto.mascotas.services;

import java.util.List;

import com.proyecto.mascotas.entidades.Contacto;

public interface ContactoService {
    
    public Contacto guardarContacto(Contacto contacto);

    public List<Contacto> lContactos();

    public void eliminarContacto(Long id);

}
