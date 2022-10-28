package com.proyecto.mascotas.services;

import java.util.List;

import com.proyecto.mascotas.entidades.Informacion;

public interface InformacionService {

    public List<Informacion> lInformacions();

    public Informacion guardarInformacion(Informacion informacion);

    public Informacion encontrarInformacion(Long id);

    public void eliminarInformacion(Long id);
    
}
