package com.proyecto.mascotas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.mascotas.entidades.Contacto;
import com.proyecto.mascotas.services.ContactoService;



@RestController 
@RequestMapping("/contacto")
public class ContactoController {

    @Autowired
    public ContactoService contactoService;

    @PostMapping()
    public Contacto guardarContacto(@RequestBody Contacto contacto){
        return contactoService.guardarContacto(contacto);
    }
    
    @GetMapping()
    public List<Contacto> lContactos(){
        return contactoService.lContactos();
    }

    @DeleteMapping("/{contactoId}")
    public void eliminarContacto(@PathVariable("contactoId") Long contactoId){
        contactoService.eliminarContacto(contactoId);
    }

    
    

}
