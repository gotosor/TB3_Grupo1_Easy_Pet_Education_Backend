package com.proyecto.mascotas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin("*")
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    public MascotaService mascotaService;

    @GetMapping()
    public List<Mascota> lMascotas() {
        return mascotaService.lMascotas();
    }

    @PostMapping()
    public Mascota guardarMascota(@RequestBody Mascota mascota) {
        return mascotaService.guardarMascota(mascota);
    }

    @GetMapping("/aprende/{id}")
    public Mascota aprendeNosotros(@PathVariable("id") long id) {
        return mascotaService.encontrarMascota(id);
    }

    @DeleteMapping("/{mascotaId}")
    public void eliminarMascota(@PathVariable("mascotaId") Long mascotaId) {
        mascotaService.eliminarMascota(mascotaId);
    }

    @PutMapping("/{id}")
    public Mascota actualizarMascota(@PathVariable("id") long id, @RequestBody Mascota mascota) {
        return mascotaService.modificarMascota(id, mascota);
    }

}
