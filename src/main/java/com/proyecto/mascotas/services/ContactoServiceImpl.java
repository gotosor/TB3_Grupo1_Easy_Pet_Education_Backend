package com.proyecto.mascotas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.mascotas.entidades.Contacto;
import com.proyecto.mascotas.repository.ContactoRepository;

@Service
public class ContactoServiceImpl implements ContactoService{

    @Autowired
    public ContactoRepository contactoRepository;

    @Override
    public Contacto guardarContacto(Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    @Override
    public List<Contacto> lContactos() {
        return contactoRepository.findAll();
    }


    @Override
    public void eliminarContacto(Long id) {
        contactoRepository.deleteById(id);
    }
    
}
