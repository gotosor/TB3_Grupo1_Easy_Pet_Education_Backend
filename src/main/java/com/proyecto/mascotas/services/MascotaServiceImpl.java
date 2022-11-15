package com.proyecto.mascotas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.mascotas.entidades.Mascota;
import com.proyecto.mascotas.repository.MascotaRepository;

@Service
public class MascotaServiceImpl implements MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    @Override
    public Mascota guardarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);

    }

    @Override
    public Mascota encontrarMascota(long id) {

        return mascotaRepository.findById(id);
    }

    @Override
    public void eliminarMascota(Long id) {
        mascotaRepository.deleteById(id);

    }

    @Override
    public Mascota modificarMascota(long id, Mascota mascota) {
        Mascota mascotalocal = encontrarMascota(id);
        mascotalocal.setNombre(mascota.getNombre());
        mascotalocal.setCarpeta(mascota.getCarpeta());
        mascotalocal.setImagenCmb(mascota.getImagenCmb());
        mascotalocal.setImagenAli(mascota.getImagenAli());
        mascotalocal.setImagenHig(mascota.getImagenHig());
        mascotalocal.setImagenAmb(mascota.getImagenAmb());
        mascotalocal.setImagenRep(mascota.getImagenRep());
        mascotalocal.setTextoAli(mascota.getTextoAli());
        mascotalocal.setTextoHig(mascota.getTextoHig());
        mascotalocal.setTextoAmb(mascota.getTextoAmb());
        mascotalocal.setTextoRep(mascota.getTextoRep());
        mascotalocal.setVideoIzq(mascota.getVideoIzq());
        mascotalocal.setVideoCent(mascota.getVideoCent());
        mascotalocal.setVideoDere(mascota.getVideoDere());
        return mascotaRepository.save(mascotalocal);
    }

    @Override
    public List<Mascota> lMascotas() {
        return mascotaRepository.findAll();
    }

}
