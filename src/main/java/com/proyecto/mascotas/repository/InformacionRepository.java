package com.proyecto.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.mascotas.entidades.Informacion;

public interface InformacionRepository extends JpaRepository <Informacion, Long >{
    public Informacion findByInformacionId(Long informacionId);
}
