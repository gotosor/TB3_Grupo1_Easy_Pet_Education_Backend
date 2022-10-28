package com.proyecto.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.mascotas.entidades.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Long>{
    public Mascota findByNombre(String nombre);
}
