package com.proyecto.mascotas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.mascotas.entidades.Mascota;

import com.proyecto.mascotas.services.MascotaService;



@RestController 
@RequestMapping("/mascotas")
public class MascotaController {
    
    @Autowired
    public MascotaService mascotaService;

    @GetMapping()
    public List<Mascota> lMascotas(){
        return mascotaService.lMascotas();
    }

    @PostMapping()
    public Mascota guardarMascota(@RequestBody Mascota mascota){
        return mascotaService.guardarMascota(mascota);
    }

    @PostMapping("/aprende/{nombre}")
    public Mascota aprendeNosotros(@PathVariable("nombre") String nombre){   
       return mascotaService.encontrarMascota(nombre); 
    }

    @DeleteMapping("/{mascotaId}")
    public void eliminarMascota(@PathVariable("mascotaId") Long mascotaId){
        mascotaService.eliminarMascota(mascotaId);
    }

    @PutMapping("/{nombre}")
    public Mascota actualizarMascota(@PathVariable("nombre") String nombre, @RequestBody Mascota mascota){
        return mascotaService.modificarMascota(nombre, mascota);
    }



}
