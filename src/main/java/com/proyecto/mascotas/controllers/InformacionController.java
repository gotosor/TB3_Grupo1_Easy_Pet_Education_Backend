package com.proyecto.mascotas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.mascotas.entidades.Informacion;
import com.proyecto.mascotas.services.InformacionService;

@RestController
@CrossOrigin("*")
@RequestMapping("/informacion")
public class InformacionController {
    @Autowired
    public InformacionService informacionService;

    @GetMapping()
    public List<Informacion> lInformacions() {
        return informacionService.lInformacions();
    }

    @PostMapping()
    public Informacion guaInformacion(@RequestBody Informacion informacion) {
        return informacionService.guardarInformacion(informacion);
    }

    @DeleteMapping("/{id}")
    public void eliminarInformacion(@PathVariable("id") Long id) {
        informacionService.eliminarInformacion(id);
    }

    @GetMapping("/{id}")
    public Informacion encontrarInformacion(@PathVariable("id") Long id) {
        return informacionService.encontrarInformacion(id);
    }

}
