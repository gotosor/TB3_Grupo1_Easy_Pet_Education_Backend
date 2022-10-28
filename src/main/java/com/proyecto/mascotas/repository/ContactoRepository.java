package com.proyecto.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.mascotas.entidades.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long>{
    
}
