package com.proyecto.mascotas.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.mascotas.entidades.Informacion;
import com.proyecto.mascotas.repository.InformacionRepository;

@Service
public class InformacionServiceImpl  implements InformacionService{
    @Autowired
    private InformacionRepository informacionRepository;

    @Override
    public List<Informacion> lInformacions() {
        
        return informacionRepository.findAll();
    }

    @Override
    public Informacion guardarInformacion(Informacion informacion) {
        return informacionRepository.save(informacion);
    }

    @Override
    public Informacion encontrarInformacion(Long id) {
        return informacionRepository.findByInformacionId(id);
    }

    @Override
    public void eliminarInformacion(Long id) {
        informacionRepository.deleteById(id);        
    }
    
}
