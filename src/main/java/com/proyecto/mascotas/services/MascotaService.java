package com.proyecto.mascotas.services;

import java.util.List;

import com.proyecto.mascotas.entidades.Mascota;

public interface MascotaService {

    public List<Mascota> lMascotas();
    
    public Mascota guardarMascota(Mascota mascota);

    public Mascota encontrarMascota(String nombre);

    public void eliminarMascota(Long id);

    public Mascota modificarMascota(String nombre, Mascota mascota);

}
